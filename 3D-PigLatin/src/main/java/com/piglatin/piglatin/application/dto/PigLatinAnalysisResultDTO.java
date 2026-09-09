package com.piglatin.piglatin.application.dto;

import com.piglatin.common.application.dto.CustomErrorDTO;
import com.piglatin.piglatin.domain.symboltable.SymbolTable;
import com.piglatin.piglatin.domain.types.TypeTable;
import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.List;

@Getter
@Setter
public class PigLatinAnalysisResultDTO {
    private final boolean isValid;
    private final List<CustomErrorDTO> errorsList;
    private final SymbolTable symbolTable;
    private final TypeTable typeTable;

    public PigLatinAnalysisResultDTO(boolean isValid,
                                     List<CustomErrorDTO> errorsList,
                                     SymbolTable symbolTable, TypeTable typeTable) {
        this.isValid = isValid;
        this.errorsList = errorsList !=  null ? errorsList : Collections.emptyList();
        this.symbolTable = symbolTable;
        this.typeTable = typeTable;
    }

}
