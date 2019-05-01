package com.lemon.idea.plugin.textprocessing.process;

import com.lemon.idea.plugin.textprocessing.TextAction;

public class ToLowerFlatSnakeCaseProcessor extends TextAction {
    public ToLowerFlatSnakeCaseProcessor() {
        super(new com.lemon.framework.processing.textprocessing.text.textcase.ToLowerFlatSnakeCaseProcessor());
    }
}
