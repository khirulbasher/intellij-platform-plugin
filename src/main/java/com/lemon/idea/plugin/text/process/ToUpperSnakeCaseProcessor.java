package com.lemon.idea.plugin.text.process;

import com.lemon.idea.plugin.text.TextAction;

public class ToUpperSnakeCaseProcessor extends TextAction {
    public ToUpperSnakeCaseProcessor() {
        super(new com.lemon.framework.processing.textprocessing.text.textcase.ToUpperSnakeCaseProcessor());
    }
}
