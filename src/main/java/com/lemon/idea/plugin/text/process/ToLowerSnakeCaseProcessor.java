package com.lemon.idea.plugin.text.process;

import com.lemon.idea.plugin.text.TextAction;

public class ToLowerSnakeCaseProcessor extends TextAction {
    public ToLowerSnakeCaseProcessor() {
        super(new com.lemon.framework.processing.textprocessing.text.textcase.ToLowerSnakeCaseProcessor());
    }
}
