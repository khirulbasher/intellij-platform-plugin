package com.lemon.framework.textprocessing.text.impl;

public class ToLowerSnakeCaseProcessor extends ToUpperSnakeCaseProcessor {

    @Override
    protected String doProcess(String text) {
        return super.doProcess(text).toLowerCase();
    }
}
