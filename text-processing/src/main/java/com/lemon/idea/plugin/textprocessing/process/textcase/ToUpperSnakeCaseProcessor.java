package com.lemon.idea.plugin.textprocessing.process.textcase;

import com.lemon.idea.plugin.textprocessing.TextAction;

public class ToUpperSnakeCaseProcessor extends TextAction {
    public ToUpperSnakeCaseProcessor() {
        super(new com.lemon.framework.processing.textprocessing.text.textcase.ToUpperSnakeCaseProcessor());
    }
}
