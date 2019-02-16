package com.lemon.framework.textprocessing.text.impl;

public class ToLowerFlatSnakeCaseProcessor extends ToFlatSnakeCaseProcessor {

    @Override
    public String process(String input) {
        return super.process(input).toLowerCase();
    }
}
