package com.piglatin.y.application.services;

import com.piglatin.common.application.dto.*;
import com.piglatin.common.application.ports.input.CompilerUseCase;
import com.piglatin.y.domain.ast.principal.NodeProgram;
import com.piglatin.y.domain.ast.visitor.ASTBuilder;
import com.piglatin.y.domain.semantic.SemanticAnalyzer;
import com.piglatin.y.domain.semantic.SemanticContext;
import com.piglatin.y.infrastructure.parser.generated.YLexer;
import com.piglatin.y.infrastructure.parser.generated.YParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class YCompiler implements CompilerUseCase {

    @Override
    public CompileResponseDTO compile(CompileRequestDTO request) {
        long startTime = System.currentTimeMillis();
        List<CompilationErrorDTO> errors = new ArrayList<>();

        CharStream input = CharStreams.fromString(request.getSourceCode() != null ? request.getSourceCode() : "");
        YLexer lexer = new YLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine, String msg, RecognitionException e) {
                errors.add(new CompilationErrorDTO(CompilationStage.LEXICAL_ANALYSIS, "Lexical Error: " + msg, line, charPositionInLine, request.getFileName()));
            }
        });

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        YParser parser = new YParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine, String msg, RecognitionException e) {
                errors.add(new CompilationErrorDTO(CompilationStage.SYNTACTIC_ANALYSIS, "Syntax Error: " + msg, line, charPositionInLine, request.getFileName()));
            }
        });

        ParseTree parseTree;
        try {
            parseTree = parser.program();
        } catch (Exception e) {
            errors.add(new CompilationErrorDTO(CompilationStage.SYNTACTIC_ANALYSIS, "Fatal Error: " + e.getMessage(), 0, 0, request.getFileName()));
            return new CompileResponseDTO(false, errors, null, null, System.currentTimeMillis() - startTime);
        }

        if (!errors.isEmpty()) {
            return new CompileResponseDTO(false, errors, null, null, System.currentTimeMillis() - startTime);
        }

        ASTBuilder astBuilder = new ASTBuilder();
        NodeProgram ast = (NodeProgram) astBuilder.visit(parseTree);

        SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer(request.getFileName());
        SemanticContext context = semanticAnalyzer.analyze(ast);

        if (context.getErrorReporter() != null && context.getErrorReporter().hasErrors()) {
            for (CustomErrorDTO err : context.getErrorReporter().getErrors()) {
                errors.add(new CompilationErrorDTO(CompilationStage.SEMANTIC_ANALYSIS, err.message(), err.line(), err.column(), request.getFileName()));
            }
        }

        if (!errors.isEmpty()) {
            return new CompileResponseDTO(false, errors, null, null, System.currentTimeMillis() - startTime);
        }

        GeneretedCodeDTO generatedCode = new GeneretedCodeDTO(null, null, "main");
        return new CompileResponseDTO(true, errors, generatedCode, null, System.currentTimeMillis() - startTime);
    }
}
