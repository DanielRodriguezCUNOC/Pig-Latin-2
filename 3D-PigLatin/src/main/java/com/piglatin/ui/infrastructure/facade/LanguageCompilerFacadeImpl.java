package com.piglatin.ui.infrastructure.facade;

import com.piglatin.common.application.dto.*;
import com.piglatin.common.application.ports.input.CompilerUseCase;
import com.piglatin.ui.infrastructure.facade.dto.*;

import java.util.ArrayList;
import java.util.List;

public class LanguageCompilerFacadeImpl implements LanguajeCompilerFacade {

    private final CompilerUseCase compilerUseCase;

    public LanguageCompilerFacadeImpl(CompilerUseCase compilerUseCase) {
        this.compilerUseCase = compilerUseCase;
    }

    @Override
    public CompilationResultDTO compileCode(String sourceCode, String fileExtension) {
        return compileCode(sourceCode, fileExtension, null, "file." + fileExtension, CompilationMode.VALIDATE_ONLY);
    }

    @Override
    public CompilationResultDTO compileCode(
            String sourceCode,
            String fileExtension,
            String projectDirectory,
            String currentFileName,
            CompilationMode mode
    ) {
        String ext = fileExtension;
        if (ext.startsWith(".")) {
            ext = ext.substring(1);
        }
        LanguageType languageType = LanguageType.fromExtension(ext);

        CompileRequestDTO request = new CompileRequestDTO();
        request.setSourceCode(sourceCode);
        request.setFileName(currentFileName);
        request.setCurrentFileName(currentFileName);
        request.setProjectDirectory(projectDirectory);
        request.setLanguageType(languageType);

        // Usar el modo recibido desde la UI (VALIDATE_ONLY o FULL)
        request.setMode(mode);

        CompileResponseDTO response = compilerUseCase.compile(request);

        List<ErrorDTO> errorDTOs = new ArrayList<>();
        if (response.getErrors() != null) {
            for (CompilationErrorDTO err : response.getErrors()) {
                errorDTOs.add(new ErrorDTO(
                        err.getLine(),
                        err.getColumn(),
                        err.getStage() != null ? err.getStage().name() : "ERROR",
                        err.getMessage()
                ));
            }
        }

        List<SymbolDTO> symbolDTOs = new ArrayList<>();
        List<TypeDTO> typeDTOs = new ArrayList<>();
        List<ScopeDTO> scopeDTOs = new ArrayList<>();

        return new CompilationResultDTO(
                response.isSuccess(),
                symbolDTOs,
                typeDTOs,
                scopeDTOs,
                errorDTOs,
                response.getExecutionOutput()
        );
    }
}
