package com.piglatin.common.domain.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Shows what happens in te code
 */
@Getter
@Setter
public class SourceLocation {

    String fileName;
    SourcePosition position;

    public SourceLocation(String fileName, SourcePosition position) {
        this.fileName = fileName;
        this.position = position;
    }
}
