package com.lemon.idea.plugin.text.impl;

import com.lemon.framework.textprocessing.text.impl.ToFlatSnakeCaseProcessor;
import com.lemon.idea.plugin.text.TextAction;

public class ToUpperFlatSnakeCase extends TextAction {
    public ToUpperFlatSnakeCase() {
        super(new ToFlatSnakeCaseProcessor());
    }
}
