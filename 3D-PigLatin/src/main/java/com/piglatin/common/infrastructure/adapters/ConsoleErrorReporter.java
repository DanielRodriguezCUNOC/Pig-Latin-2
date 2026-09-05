package com.piglatin.common.infrastructure.adapters;

import com.piglatin.common.application.dto.CompilationErrorDTO;
import com.piglatin.common.application.ports.output.ErrorReporter;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Show the errors with format
 */
@Getter
@Setter
public class ConsoleErrorReporter implements ErrorReporter {

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
