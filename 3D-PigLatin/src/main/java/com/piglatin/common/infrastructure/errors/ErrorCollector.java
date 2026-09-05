package com.piglatin.common.infrastructure.errors;

import com.piglatin.common.application.dto.CompilationErrorDTO;
import com.piglatin.common.application.ports.output.ErrorReporter;

import java.util.List;

/**
 * This class have a CompilationError list
 * Then we get all errors when is necessary
 */
public class ErrorCollector implements ErrorReporter {

    @Override
    public void report(CompilationErrorDTO error) {

    }

    @Override
    public void reportAll(List<CompilationErrorDTO> errors) {

    }

    @Override
    public List<CompilationErrorDTO> getErrors() {
        return List.of();
    }

    @Override
    public boolean hasFatalErrors() {
        return false;
    }

    @Override
    public void clear() {

    }
}
