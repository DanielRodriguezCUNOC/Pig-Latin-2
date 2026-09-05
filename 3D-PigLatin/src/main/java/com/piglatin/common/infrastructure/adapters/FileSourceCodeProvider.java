package com.piglatin.common.infrastructure.adapters;

import com.piglatin.common.application.ports.output.SourceCodeProvider;
import lombok.Getter;
import lombok.Setter;

/**
 * Read file .pig, .y and .z
 */
@Getter
@Setter
public class FileSourceCodeProvider implements SourceCodeProvider {

    @Override
    public String readSource(String filePath) {
        return "";
    }

    @Override
    public boolean exists(String filePath) {
        return false;
    }

    @Override
    public String resolvePath(String projectRoot, String importPath) {
        return "";
    }
}
