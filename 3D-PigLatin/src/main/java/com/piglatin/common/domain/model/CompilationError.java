package com.piglatin.common.domain.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Shows a message and the location
 */
@Getter
@Setter
public class CompilationError {

    String message;
    SourceLocation location;

    public CompilationError(String message, SourceLocation location) {
        this.message = message;
        this.location = location;
    }
}
