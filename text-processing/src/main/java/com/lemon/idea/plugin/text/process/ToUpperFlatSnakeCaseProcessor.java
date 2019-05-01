package com.lemon.idea.plugin.text.process;

import com.lemon.framework.processing.textprocessing.text.textcase.ToFlatSnakeCaseProcessor;
import com.lemon.idea.plugin.text.TextAction;

public class ToUpperFlatSnakeCaseProcessor extends TextAction {
    public ToUpperFlatSnakeCaseProcessor() {
        super(new ToFlatSnakeCaseProcessor());
    }
}
