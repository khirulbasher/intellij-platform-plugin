package com.lemon.framework.processing.textprocessing.text.textcase;

public class ToLowerFlatSnakeCaseProcessor extends ToFlatSnakeCaseProcessor {

    @Override
    public String process(String input) {
        return super.process(input).toLowerCase();
    }
}
