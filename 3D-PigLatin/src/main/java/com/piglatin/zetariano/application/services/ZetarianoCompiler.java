package com.piglatin.zetariano.application.services;

import com.piglatin.common.application.dto.*;
import com.piglatin.common.application.ports.input.CompilerUseCase;
import com.piglatin.zetariano.domain.ast.principal.ASTNode;
import com.piglatin.zetariano.domain.ast.principal.NodeProgram;
import com.piglatin.zetariano.domain.ast.statements.NodeClassDeclaration;
import com.piglatin.zetariano.domain.ast.statements.NodeConstructorDeclaration;
import com.piglatin.zetariano.domain.ast.statements.NodeFieldDeclaration;
import com.piglatin.zetariano.domain.ast.statements.NodeMethodDeclaration;
import com.piglatin.zetariano.domain.ast.visitor.ASTBuilder;
import com.piglatin.zetariano.domain.semantic.SemanticAnalyzer;
import com.piglatin.zetariano.domain.semantic.SemanticContext;
import com.piglatin.zetariano.domain.symboltable.*;
import com.piglatin.zetariano.domain.types.TypeTable;
import com.piglatin.zetariano.infrastructure.parser.generated.ZetarianoLexer;
import com.piglatin.zetariano.infrastructure.parser.generated.ZetarianoParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ZetarianoCompiler implements CompilerUseCase {

    @Override
    public CompileResponseDTO compile(CompileRequestDTO request) {
        long startTime = System.currentTimeMillis();
        List<CompilationErrorDTO> errors = new ArrayList<>();

        CharStream input = CharStreams.fromString(request.getSourceCode() != null ? request.getSourceCode() : "");
        ZetarianoLexer lexer = new ZetarianoLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine, String msg, RecognitionException e) {
                errors.add(new CompilationErrorDTO(CompilationStage.LEXICAL_ANALYSIS, "Lexical Error: " + msg, line, charPositionInLine, request.getFileName()));
            }
        });

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ZetarianoParser parser = new ZetarianoParser(tokens);
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

        TypeTable typeTable = new TypeTable();
        SymbolTable symbolTable = new SymbolTable();

        if (request.getProjectDirectory() != null) {
            loadSiblingClasses(request.getProjectDirectory(), request.getCurrentFileName(), typeTable, symbolTable);
        }

        SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer(request.getFileName());
        SemanticContext context = semanticAnalyzer.analyze(ast, typeTable, symbolTable);

        if (context.getErrorReporter() != null && context.getErrorReporter().hasErrors()) {
            for (CompilationErrorDTO err : context.getErrorReporter().getErrors()) {
                errors.add(err);
            }
        }

        if (!errors.isEmpty()) {
            return new CompileResponseDTO(false, errors, null, null, System.currentTimeMillis() - startTime);
        }

        GeneretedCodeDTO generatedCode = new GeneretedCodeDTO(null, null, "main");
        return new CompileResponseDTO(true, errors, generatedCode, null, System.currentTimeMillis() - startTime);
    }

    private void loadSiblingClasses(String projectDirectory, String currentFileName, TypeTable typeTable, SymbolTable symbolTable) {
        File dir = new File(projectDirectory);
        if (!dir.exists() || !dir.isDirectory()) return;

        File[] files = dir.listFiles((d, name) -> name.endsWith(".z") && !name.equals(currentFileName));
        if (files == null) return;

        for (File file : files) {
            try {
                String siblingCode = Files.readString(file.toPath());
                CharStream input = CharStreams.fromString(siblingCode);
                ZetarianoLexer lexer = new ZetarianoLexer(input);
                lexer.removeErrorListeners();
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                ZetarianoParser parser = new ZetarianoParser(tokens);
                parser.removeErrorListeners();

                ParseTree tree = parser.program();
                ASTBuilder builder = new ASTBuilder();
                NodeProgram program = (NodeProgram) builder.visit(tree);

                if (program != null && program.getClassDeclaration() != null) {
                    registerSiblingClass(program.getClassDeclaration(), typeTable, symbolTable);
                }
            } catch (Exception e) {
            System.err.println("[loadSiblingClasses] Skipping " + file.getName()
                    + " due to: " + e.getClass().getSimpleName() + ": " + e.getMessage());
        }
        }
    }

    private void registerSiblingClass(NodeClassDeclaration n, TypeTable typeTable, SymbolTable symbolTable) {
        String className = n.getName();
        typeTable.registerClass(className);
        symbolTable.declare(className, new ClassSymbol(className, n.getLine(), n.getColumn()));

        for (ASTNode member : n.getMembers()) {
            if (member instanceof NodeFieldDeclaration f) {
                int dims = f.isArray() ? Math.max(1, f.getDimensions()) : 0;
                String fType = f.getType() + (f.isArray() ? "[]".repeat(dims) : "");
                Symbol fieldSym;
                if (f.isArray()) {
                    fieldSym = new ArraySymbol(f.getName(), "SERIES_" + f.getType(),
                            dims, f.getType(), f.getLine(), f.getColumn());
                } else {
                    fieldSym = new VariableSymbol(f.getName(), fType, f.getLine(), f.getColumn());
                }
                symbolTable.declareField(className, f.getName(), fieldSym);
            } else if (member instanceof NodeMethodDeclaration m) {
                MethodSymbol method = new MethodSymbol(
                        m.getName(), m.getReturnType(),
                        m.getParameters().stream()
                                .map(p -> p.getType() + (p.isArray() ? "[]" : ""))
                                .collect(Collectors.toList()),
                        m.getLine(), m.getColumn());
                symbolTable.declareMethod(className, method);
            } else if (member instanceof NodeConstructorDeclaration c) {
                MethodSymbol ctor = new MethodSymbol(
                        c.getName(), "void",
                        c.getParameters().stream()
                                .map(p -> p.getType() + (p.isArray() ? "[]" : ""))
                                .collect(Collectors.toList()),
                        c.getLine(), c.getColumn());
                symbolTable.declareMethod(className, ctor);
            }
        }
    }
}
