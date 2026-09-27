package com.piglatin.y.domain.symboltable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Symbol {

    private final String name;
    private final int line;
    private final int column;
    private int offset = -1;
    private int size = 0;

    protected Symbol(String name, int line, int column) {
        this.name = name;
        this.line = line;
        this.column = column;
    }

}