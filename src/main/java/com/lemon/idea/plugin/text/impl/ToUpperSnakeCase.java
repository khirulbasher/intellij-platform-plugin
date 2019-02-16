package com.lemon.idea.plugin.text.impl;

import com.lemon.framework.textprocessing.text.impl.ToUpperSnakeCaseProcessor;
import com.lemon.idea.plugin.text.TextAction;

public class ToUpperSnakeCase extends TextAction {
    public ToUpperSnakeCase() {
        super(new ToUpperSnakeCaseProcessor());
    }
}