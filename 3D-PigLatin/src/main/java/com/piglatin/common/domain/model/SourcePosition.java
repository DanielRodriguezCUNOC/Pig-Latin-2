package com.piglatin.common.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Give the linea and column inside the source code
 */
@Getter
@Setter
public class SourcePosition {

    int line;
    int column;

    public SourcePosition(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public SourcePosition() {
    }
}
