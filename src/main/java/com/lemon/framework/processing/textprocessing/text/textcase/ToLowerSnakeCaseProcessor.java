package com.lemon.framework.processing.textprocessing.text.textcase;

public class ToLowerSnakeCaseProcessor extends ToUpperSnakeCaseProcessor {

    @Override
    protected String doProcess(String text) {
        return super.doProcess(text).toLowerCase();
    }
}
