package com.piglatin.piglatin.application.services;

import com.piglatin.common.application.dto.CompilationErrorDTO;
import com.piglatin.common.application.dto.CompilationStage;
import com.piglatin.common.application.dto.CompileRequestDTO;
import com.piglatin.common.application.dto.CompileResponseDTO;
import com.piglatin.common.application.dto.CustomErrorDTO;
import com.piglatin.common.application.dto.GeneretedCodeDTO;
import com.piglatin.common.application.ports.input.CompilerUseCase;
import com.piglatin.common.application.ports.output.ErrorReporter;
import com.piglatin.piglatin.application.dto.ParserResultDTO;
import com.piglatin.piglatin.domain.ast.principal.NodeProgram;
import com.piglatin.piglatin.infrastructure.parser.PigLatinServiceAnalyzer;

import java.util.ArrayList;
import java.util.List;

public class PigLatinCompiler implements CompilerUseCase {

    private final PigLatinServiceAnalyzer parser;
    private final PigLatinTreeMapperService treeMapper;
    private final PigLatinSemanticAnalyzer semanticAnalyzer;
    private final ErrorReporter errorReporter;

    public PigLatinCompiler(
            PigLatinServiceAnalyzer parser,
            PigLatinTreeMapperService treeMapper,
            PigLatinSemanticAnalyzer semanticAnalyzer,
            ErrorReporter errorReporter
    ) {
        this.parser = parser;
        this.treeMapper = treeMapper;
        this.semanticAnalyzer = semanticAnalyzer;
        this.errorReporter = errorReporter;
    }

    @Override
    public CompileResponseDTO compile(CompileRequestDTO request) {
        long startTime = System.currentTimeMillis();

        ParserResultDTO parserResult = parser.executeAnalysis(request.getSourceCode());

        List<CompilationErrorDTO> errors = new ArrayList<>(
                convertParserErrors(parserResult.getErrorsList(), request)
        );

        if (!errors.isEmpty() || parserResult.getParseTree() == null) {
            if (parserResult.getParseTree() == null && errors.isEmpty()) {
                errors.add(new CompilationErrorDTO(
                        CompilationStage.SYNTACTIC_ANALYSIS, "Cannot generate syntax tree.", 1, 1, request.getFileName()));
            }
            errorReporter.reportAll(errors);
            return buildResponse(false, errors, startTime);
        }

        try {
            NodeProgram ast = treeMapper.buildAST(parserResult);

            List<CustomErrorDTO> semanticErrors = semanticAnalyzer.analyze(ast);
            List<CompilationErrorDTO> semErrors = convertSemanticErrors(semanticErrors, request);
            errors.addAll(semErrors);

            if (!errors.isEmpty()) {
                errorReporter.reportAll(semErrors);
                return buildResponse(false, errors, startTime);
            }

        } catch (Exception e) {
            errors.add(new CompilationErrorDTO(CompilationStage.SEMANTIC_ANALYSIS, "Internal error during analysis: " + e.getMessage(), 1, 1,request.getFileName()));
            errorReporter.reportAll(errors);
            return buildResponse(false, errors, startTime);
        }

        GeneretedCodeDTO generatedCode = new GeneretedCodeDTO(null, null, "main");
        return buildResponse(true, errors, generatedCode, startTime);
    }

    private List<CompilationErrorDTO> convertParserErrors(
            List<CustomErrorDTO> parserErrors,
            CompileRequestDTO request
    ) {
        List<CompilationErrorDTO> errors = new ArrayList<>();

        if (parserErrors == null) {
            return errors;
        }

        for (CustomErrorDTO error : parserErrors) {

            CompilationStage stage;

            if (error.message().startsWith("Lexical Error:")) {
                stage = CompilationStage.LEXICAL_ANALYSIS;
            } else {
                stage = CompilationStage.SYNTACTIC_ANALYSIS;
            }

            errors.add(
                    new CompilationErrorDTO(
                            stage,
                            error.message(),
                            error.line(),
                            error.column(),
                            request.getFileName()
                    )
            );
        }

        return errors;
    }

    private List<CompilationErrorDTO> convertSemanticErrors(
            List<CustomErrorDTO> semanticErrors,
            CompileRequestDTO request
    ) {
        List<CompilationErrorDTO> errors = new ArrayList<>();

        if (semanticErrors == null) {
            return errors;
        }

        for (CustomErrorDTO error : semanticErrors) {

            errors.add(
                    new CompilationErrorDTO(
                            CompilationStage.SEMANTIC_ANALYSIS,
                            error.message(),
                            error.line(),
                            error.column(),
                            request.getFileName()
                    )
            );
        }

        return errors;
    }

    private CompileResponseDTO buildResponse(
            boolean success,
            List<CompilationErrorDTO> errors,
            long startTime
    ) {
        return buildResponse(
                success,
                errors,
                null,
                startTime
        );
    }

    private CompileResponseDTO buildResponse(
            boolean success,
            List<CompilationErrorDTO> errors,
            GeneretedCodeDTO generatedCode,
            long startTime
    ) {
        return new CompileResponseDTO(
                success,
                errors,
                generatedCode,
                null,
                System.currentTimeMillis() - startTime
        );
    }
}