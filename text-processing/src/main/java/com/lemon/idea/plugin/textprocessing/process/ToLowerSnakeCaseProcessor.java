package com.lemon.idea.plugin.textprocessing.process;

import com.lemon.idea.plugin.textprocessing.TextAction;

public class ToLowerSnakeCaseProcessor extends TextAction {
    public ToLowerSnakeCaseProcessor() {
        super(new com.lemon.framework.processing.textprocessing.text.textcase.ToLowerSnakeCaseProcessor());
    }
}
