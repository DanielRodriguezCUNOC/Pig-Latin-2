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

         //* Lexical and syntactic analysis
        ParserResultDTO parserResult =
                parser.executeAnalysis(request.getSourceCode());

         //* 2. Convert ANTLR ParseTree -> PigLatin AST
        NodeProgram ast = treeMapper.buildAST(parserResult);

         //*Convert parser errors to common compilation errors
        List<CompilationErrorDTO> errors =
                convertParserErrors(parserResult.getErrorsList(), request);

        /*
         * If lexical or syntactic errors exist,
         * semantic analysis must not continue.
         */
        if (!errors.isEmpty()) {
            return buildResponse(
                    false,
                    errors,
                    startTime
            );
        }

         //* Semantic analysis

        List<CustomErrorDTO> semanticErrors =
                semanticAnalyzer.analyze(ast);

        errors.addAll(
                convertSemanticErrors(semanticErrors, request)
        );

         //* Semantic errors

        if (!errors.isEmpty()) {
            return buildResponse(
                    false,
                    errors,
                    startTime
            );
        }

        /*
         * Code generation
         * No implemented yet XD
         */
        GeneretedCodeDTO generatedCode =
                new GeneretedCodeDTO(
                        null,
                        null,
                        "main"
                );


         //* Successful compilation

        return buildResponse(
                true,
                errors,
                generatedCode,
                startTime
        );
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