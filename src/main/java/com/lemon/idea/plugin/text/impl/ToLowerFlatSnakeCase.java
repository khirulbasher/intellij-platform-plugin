package com.lemon.idea.plugin.text.impl;

import com.lemon.framework.processing.textprocessing.text.textcase.ToLowerFlatSnakeCaseProcessor;
import com.lemon.idea.plugin.text.TextAction;

public class ToLowerFlatSnakeCase extends TextAction {
    public ToLowerFlatSnakeCase() {
        super(new ToLowerFlatSnakeCaseProcessor());
    }
}
