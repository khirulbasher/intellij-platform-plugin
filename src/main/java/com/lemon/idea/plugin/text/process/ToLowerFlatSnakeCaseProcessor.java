package com.lemon.idea.plugin.text.process;

import com.lemon.idea.plugin.text.TextAction;

public class ToLowerFlatSnakeCaseProcessor extends TextAction {
    public ToLowerFlatSnakeCaseProcessor() {
        super(new com.lemon.framework.processing.textprocessing.text.textcase.ToLowerFlatSnakeCaseProcessor());
    }
}
