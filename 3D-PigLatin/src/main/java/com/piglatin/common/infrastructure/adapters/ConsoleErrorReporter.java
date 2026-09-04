package com.piglatin.common.infrastructure.adapters;

import com.piglatin.common.application.ports.output.ErrorReporter;
import lombok.Getter;
import lombok.Setter;

/**
 * Show the errors with format
 */
@Getter
@Setter
public class ConsoleErrorReporter implements ErrorReporter {
}
