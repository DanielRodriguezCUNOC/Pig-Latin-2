package com.piglatin.zetariano.domain.symboltable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Symbol {

    protected final String name;
    protected final int line, column;

}
