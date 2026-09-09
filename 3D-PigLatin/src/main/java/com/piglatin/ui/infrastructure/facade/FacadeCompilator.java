package com.piglatin.ui.infrastructure.facade;

import com.piglatin.common.application.dto.CustomErrorDTO;
import com.piglatin.piglatin.application.dto.ParserResultDTO;
import com.piglatin.piglatin.application.dto.PigLatinAnalysisResultDTO;
import com.piglatin.piglatin.domain.ast.principal.NodeProgram;
import com.piglatin.piglatin.domain.cfg.ControlFlowGraph;
import com.piglatin.piglatin.domain.symboltable.SymbolTable;
import com.piglatin.piglatin.domain.types.TypeTable;
import com.piglatin.piglatin.infrastructure.cfg.CFGBuilder;
import com.piglatin.piglatin.infrastructure.semantic.SemanticErrorReporter;
import com.piglatin.piglatin.infrastructure.semantic.SymbolTableBuilder;
import com.piglatin.piglatin.infrastructure.semantic.TypeChecker;
import com.piglatin.piglatin.infrastructure.services.PigLatinServiceAnalyzer;
import com.piglatin.piglatin.infrastructure.services.PigLatinTreeMapperService;
import lombok.Getter;
import lombok.Setter;

import javax.swing.tree.DefaultTreeModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Facade Pattern:Connect the GUI with the backend
 */
@Getter
@Setter
public class FacadeCompilator {

    private final PigLatinServiceAnalyzer serviceAnalyzer;
    private final PigLatinTreeMapperService treeMapperService;

    private NodeProgram lastAST;
    private ControlFlowGraph lastCFG;

    public FacadeCompilator(PigLatinServiceAnalyzer serviceAnalyzer, PigLatinTreeMapperService treeMapperService) {
        this.serviceAnalyzer = serviceAnalyzer;
        this.treeMapperService = treeMapperService;
    }

    public PigLatinAnalysisResultDTO codeAnalyze(String sourceCode) {
        //* Sintactic/Lexic analysis
        ParserResultDTO parserResult = serviceAnalyzer.executeAnalysis(sourceCode);

        List<CustomErrorDTO> allErrors = new ArrayList<>(parserResult.getErrorsList());

        //* Build AST
        NodeProgram ast = treeMapperService.buildAST(parserResult);

        SymbolTable symbolTable = new SymbolTable();
        TypeTable typeTable = new TypeTable();
        ControlFlowGraph cfg = null;

        if (ast != null && parserResult.getErrorsList().isEmpty()) {
            SemanticErrorReporter errorReporter = new SemanticErrorReporter();

            //* SSymbol Table
            SymbolTableBuilder symbolTableBuilder = new SymbolTableBuilder(typeTable, errorReporter);
            ast.accept(symbolTableBuilder);
            symbolTable = symbolTableBuilder.getSymbolTable();

            //* Check Types
            TypeChecker typeChecker = new TypeChecker(typeTable, errorReporter, symbolTable);
            ast.accept(typeChecker);

            //* Semantic errors detected
            if (errorReporter.hasErrors()) {
                allErrors.addAll(errorReporter.getErrors());
            } else {
                //* Generate CFG
                CFGBuilder cfgBuilder = new CFGBuilder();
                cfg = cfgBuilder.build(ast);
            }
        }

        boolean isValid = allErrors.isEmpty();

        if (isValid) {
            this.lastAST = ast;
            this.lastCFG = cfg;
        }

        return new PigLatinAnalysisResultDTO(
                isValid,
                allErrors,
                symbolTable,
                typeTable,
                cfg
        );
    }
}