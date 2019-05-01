package com.lemon.framework.processing.textprocessing.text.textcase;

import java.util.function.Function;

public class ToUpperSnakeCaseProcessor extends AbstractTextCaseSeparateProcessor {
    public ToUpperSnakeCaseProcessor() {
        super("_");
    }

    public ToUpperSnakeCaseProcessor(Function<Character, Character> applyWhenFoundSeparatedEntryPoint) {
        super("_", applyWhenFoundSeparatedEntryPoint);
    }

}
