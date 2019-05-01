package com.lemon.idea.plugin.text.impl;

import com.lemon.framework.processing.textprocessing.text.textcase.ToLowerSnakeCaseProcessor;
import com.lemon.idea.plugin.text.TextAction;

public class ToLowerSnakeCase extends TextAction {
    public ToLowerSnakeCase() {
        super(new ToLowerSnakeCaseProcessor());
    }
}
