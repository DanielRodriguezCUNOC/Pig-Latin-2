package com.piglatin.piglatin.domain.cfg;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the complete Directed Control Flow Graph.
 */
@Getter
@Setter
public class ControlFlowGraph {

    private final BasicBlock entryBlock;
    private final BasicBlock exitBlock;
    private final List<BasicBlock> blocks;

    public ControlFlowGraph(BasicBlock entryBlock, BasicBlock exitBlock) {
        this.entryBlock = entryBlock;
        this.exitBlock = exitBlock;
        this.blocks = new ArrayList<>();

        this.blocks.add(entryBlock);
        this.blocks.add(exitBlock);
    }

    public void addBlock(BasicBlock block) {
        if (!blocks.contains(block)) {
            blocks.add(block);
        }
    }
}