package com.piglatin.common.infrastructure.codegen;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Quadruple {
    private String op;
    private String arg1;
    private String arg2;
    private String result;

    @Override
    public String toString() {
        if (op == null) return "";
        switch (op) {
            case "LABEL":
                return arg1 + ":";
            case "GOTO":
                return "goto " + result;
            case "IF_TRUE":
                return "if (" + arg1 + " == 1) goto " + result;
            case "IF_FALSE":
                return "if (" + arg1 + " == 0) goto " + result;
            case "PRINT":
                return "print " + arg1;
            case "READ":
                return "read " + result;
            case "=":
                return result + " = " + arg1;
            default:
                if (arg2 == null || arg2.isEmpty()) {
                    return result + " = " + op + " " + arg1;
                }
                return result + " = " + arg1 + " " + op + " " + arg2;
        }
    }
}