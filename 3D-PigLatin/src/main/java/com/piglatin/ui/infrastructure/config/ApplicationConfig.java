package com.piglatin.ui.infrastructure.config;

import com.piglatin.common.application.ports.input.CompilerUseCase;
import com.piglatin.common.application.ports.input.ExecutionCCode;
import com.piglatin.common.application.ports.output.ErrorReporter;
import com.piglatin.common.application.ports.output.Logger;
import com.piglatin.common.application.ports.output.ResultExporter;
import com.piglatin.common.application.services.CompileManager;
import com.piglatin.common.application.dto.LanguageType;
import com.piglatin.common.infrastructure.adapters.ErrorCollector;
import com.piglatin.common.infrastructure.adapters.FileResultExporter;
import com.piglatin.common.infrastructure.adapters.GCCCodeExecutor;
import com.piglatin.common.infrastructure.adapters.LoggerAdapter;
import com.piglatin.piglatin.application.services.PigLatinCompiler;
import com.piglatin.piglatin.application.services.PigLatinSemanticAnalyzer;
import com.piglatin.piglatin.application.services.PigLatinTreeMapperService;
import com.piglatin.piglatin.infrastructure.parser.PigLatinServiceAnalyzer;

import java.util.HashMap;
import java.util.Map;

public class ApplicationConfig {

    public static CompilerUseCase createCompiler() {

        /*
         * Common infrastructure
         */
        ErrorReporter errorReporter =
                new ErrorCollector();

        Logger logger =
                new LoggerAdapter("Compiler");

        ResultExporter resultExporter =
                new FileResultExporter("output");

        ExecutionCCode executionCCode =
                new GCCCodeExecutor();

        /*
         * PigLatin compiler
         */
        PigLatinCompiler pigLatinCompiler =
                new PigLatinCompiler(
                        new PigLatinServiceAnalyzer(),
                        new PigLatinTreeMapperService(),
                        new PigLatinSemanticAnalyzer(),
                        errorReporter
                );

        /*
         * Register language compilers
         */
        Map<LanguageType, CompilerUseCase> compilers =
                new HashMap<>();

        compilers.put(
                LanguageType.PIGLATIN,
                pigLatinCompiler
        );

        /*
         * Global compiler manager
         */
        return new CompileManager(
                compilers,
                errorReporter,
                resultExporter,
                executionCCode,
                logger
        );
    }
}