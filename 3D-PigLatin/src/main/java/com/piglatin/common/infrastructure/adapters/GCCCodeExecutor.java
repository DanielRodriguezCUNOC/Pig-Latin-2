package com.piglatin.common.infrastructure.adapters;

import com.piglatin.common.application.dto.ExecutionResponse;
import com.piglatin.common.application.ports.input.ExecutionCCode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class GCCCodeExecutor implements ExecutionCCode {

    @Override
    public ExecutionResponse execute(String cCode, String entryPoint) {

        long startTime = System.currentTimeMillis();

        Path tempDirectory = null;

        try {
            tempDirectory = Files.createTempDirectory("piglatin-");

            Path cFile = tempDirectory.resolve("program.c");
            Path executable = tempDirectory.resolve("program");

            /*
             * Write generated C code
             */
            Files.writeString(cFile, cCode);

            /*
             * Compile C code using GCC
             */
            Process compileProcess = new ProcessBuilder(
                    "gcc",
                    cFile.toString(),
                    "-o",
                    executable.toString()
            )
                    .redirectErrorStream(false)
                    .start();

            String compileOutput =
                    new String(compileProcess.getInputStream().readAllBytes());

            String compileError =
                    new String(compileProcess.getErrorStream().readAllBytes());

            int compileExitCode = compileProcess.waitFor();

            /*
             * GCC compilation failed
             */
            if (compileExitCode != 0) {
                return ExecutionResponse.builder()
                        .exitCode(compileExitCode)
                        .standardOutput(compileOutput)
                        .standardError(compileError)
                        .executionTimeMs(
                                System.currentTimeMillis() - startTime
                        )
                        .build();
            }

            /*
             * Execute generated binary
             */
            Process executionProcess =
                    new ProcessBuilder(executable.toString())
                            .redirectErrorStream(false)
                            .start();

            String standardOutput =
                    new String(executionProcess.getInputStream().readAllBytes());

            String standardError =
                    new String(executionProcess.getErrorStream().readAllBytes());

            int exitCode = executionProcess.waitFor();

            return ExecutionResponse.builder()
                    .exitCode(exitCode)
                    .standardOutput(standardOutput)
                    .standardError(
                            compileError + standardError
                    )
                    .executionTimeMs(
                            System.currentTimeMillis() - startTime
                    )
                    .build();

        } catch (IOException e) {

            return ExecutionResponse.builder()
                    .exitCode(-1)
                    .standardOutput("")
                    .standardError(
                            "Error executing GCC: " + e.getMessage()
                    )
                    .executionTimeMs(
                            System.currentTimeMillis() - startTime
                    )
                    .build();

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();

            return ExecutionResponse.builder()
                    .exitCode(-1)
                    .standardOutput("")
                    .standardError(
                            "Execution interrupted: " + e.getMessage()
                    )
                    .executionTimeMs(
                            System.currentTimeMillis() - startTime
                    )
                    .build();
        }
    }
}