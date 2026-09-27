package com.piglatin.common.infrastructure.codegen;

public class C3DToCConverter {

    public static String convertToC(C3DContext ctx) {
        StringBuilder cCode = new StringBuilder();

        cCode.append("#include <stdio.h>\n");
        cCode.append("#include <float.h>\n\n");
        cCode.append("//Codigo generado por  Paboomi");

        cCode.append("double Stack[100000];\n");
        cCode.append("double Heap[100000];\n");
        cCode.append("double P = 0;\n");
        cCode.append("double H = 0;\n\n");

        if (ctx.getTempCounter() > 0) {
            cCode.append("double ");
            for (int i = 0; i < ctx.getTempCounter(); i++) {
                cCode.append("t").append(i);
                if (i < ctx.getTempCounter() - 1) cCode.append(", ");
            }
            cCode.append(";\n\n");
        }

        cCode.append("int main() {\n");

        for (Quadruple q : ctx.getQuadruples()) {
            if ("LABEL".equals(q.getOp())) {
                cCode.append("  ").append(q.toString()).append("\n");
            } else if (q.toString().startsWith("goto")) {
                cCode.append("  ").append(q.toString()).append(";\n");
            } else if ("PRINT".equals(q.getOp())) {
                cCode.append("  printf(\"%f\\n\", (double)(").append(q.getArg1()).append("));\n");
            } else if ("READ".equals(q.getOp())) {
                cCode.append("  scanf(\"%lf\", &").append(q.getResult()).append(");\n");
            } else if (!q.toString().isEmpty()) {
                cCode.append("  ").append(q.toString()).append(";\n");
            }
        }

        cCode.append("  return 0;\n");
        cCode.append("}\n");

        return cCode.toString();
    }
}