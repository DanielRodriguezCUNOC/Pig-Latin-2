package com.piglatin.common.application.services;

import com.piglatin.common.application.dto.*;
import com.piglatin.common.application.ports.input.CompilerUseCase;
import com.piglatin.common.application.ports.input.ExecutionCCode;
import com.piglatin.common.application.ports.output.ErrorReporter;
import com.piglatin.common.application.ports.output.Logger;
import com.piglatin.common.application.ports.output.ResultExporter;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * This class coordinates the output ports
 * Execute the generate code
 */
@RequiredArgsConstructor
public class CompileManager implements CompilerUseCase {

    private final Map<LanguageType, CompilerUseCase> languajeCompilers;
    private final ErrorReporter errorReporter;
    private final ResultExporter resultExporter;
    private final ExecutionCCode executionCCode;
    private final Logger logger;

    @Override
    public CompileResponseDTO compile(CompileRequestDTO request) {
        long startTime = System.currentTimeMillis();
        logger.info("Starting compilation for the language: " + request.getLanguageType());

        errorReporter.clear();

        CompilerUseCase compiler = resolveCompiler(request.getLanguageType());
        if (compiler == null) {
            logger.error("Compiler not found for the language: " + request.getLanguageType());
            return buildErrorResponse (request, "Compiler not available for the language");
        }
        CompileResponseDTO responseDTO = compiler.compile(request);

        if (!responseDTO.isSuccess() || errorReporter.hasFatalErrors()) {

            logger.warn("Compilation failed. Errors detected: " + errorReporter.getErrors().size());
            responseDTO.setSuccess(false);
            responseDTO.setErrors(errorReporter.getErrors());
            responseDTO.setCompilationTimeMs(System.currentTimeMillis() - startTime);
            return responseDTO;
        }

        if (shouldExport(request.getMode())) exportResult(responseDTO, request.getFileName());
        if (request.getMode() == CompilationMode.FULL &&
                responseDTO.getGeneratedCode() != null) executeGeneratedCode(responseDTO);

        responseDTO.setCompilationTimeMs(System.currentTimeMillis() - startTime);
        logger.info("Finished compilation for the language: " + request.getLanguageType() +
                " in" + responseDTO.getCompilationTimeMs() + " ms");
        return responseDTO;
    }

    private CompilerUseCase resolveCompiler(LanguageType languageType) {
        return languajeCompilers.get(languageType);
    }

    private boolean shouldExport (CompilationMode mode) {
        return (mode == CompilationMode.C3D_ONLY
                || mode == CompilationMode.C_CODE_ONLY
                || mode == CompilationMode.FULL);
    }

    private void exportResult (CompileResponseDTO response, String baseFileName) {
        GeneretedCodeDTO generated = response.getGeneratedCode();

        if (generated == null) return;

        try {
            if (generated.getC3dCode() != null && !generated.getC3dCode().isBlank()) {
                String c3dPath = resultExporter.export3DC(generated.getC3dCode(), baseFileName);
                logger.info("3DC exported to: " + c3dPath);
            }

            if (generated.getCCode() != null && !generated.getCCode().isBlank()) {
                String cPath = resultExporter.exportC(generated.getCCode(), baseFileName);
                logger.info("C code exported to: " + cPath);
            }

        } catch (Exception e) {
            logger.error("Error exporting results", e);
        }
    }

    private void executeGeneratedCode (CompileResponseDTO response) {
        GeneretedCodeDTO generated = response.getGeneratedCode();
        if (generated == null || generated.getCCode() == null) return;
        try {
           ExecutionResponse exec = executionCCode.execute(generated.getCCode(), generated.getCCode());
           response.setExecutionOutput(exec.getStandardOutput());
           if (!exec.isSuccess()){
               logger.error("Error executing generated code: " + exec.getStandardError());
           }
        }catch (Exception e) {
            logger.error("Error during execution of generated code", e);
        }
    }

    private CompileResponseDTO buildErrorResponse (CompileRequestDTO request, String message) {
        CompilationErrorDTO errorDTO = new CompilationErrorDTO();
        errorDTO.setStage(CompilationStage.SEMANTIC_ANALYSIS);
        errorDTO.setMessage(message);
        errorDTO.setLine(0);
        errorDTO.setColumn(0);
        errorDTO.setFileName(request.getFileName());

        CompileResponseDTO responseDTO = new CompileResponseDTO();
        responseDTO.setSuccess(false);
        responseDTO.setErrors(List.of(errorDTO));
        responseDTO.setCompilationTimeMs(0L);
        return responseDTO;
    }

}
