package com.lemon.idea.plugin.text.impl;

import com.lemon.framework.processing.textprocessing.text.textcase.ToFlatSnakeCaseProcessor;
import com.lemon.idea.plugin.text.TextAction;

public class ToUpperFlatSnakeCase extends TextAction {
    public ToUpperFlatSnakeCase() {
        super(new ToFlatSnakeCaseProcessor());
    }
}
