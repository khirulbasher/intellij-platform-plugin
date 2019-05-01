package com.lemon.idea.plugin.textprocessing.process;

import com.lemon.framework.processing.textprocessing.text.textcase.ToFlatSnakeCaseProcessor;
import com.lemon.idea.plugin.textprocessing.TextAction;

public class ToUpperFlatSnakeCaseProcessor extends TextAction {
    public ToUpperFlatSnakeCaseProcessor() {
        super(new ToFlatSnakeCaseProcessor());
    }
}
