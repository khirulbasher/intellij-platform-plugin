package com.lemon.idea.plugin.text.impl;

import com.lemon.framework.processing.textprocessing.text.textcase.ToUpperCamelCaseProcessor;
import com.lemon.idea.plugin.text.TextAction;

public class ToUpperCamelCase extends TextAction {
    public ToUpperCamelCase() {
        super(new ToUpperCamelCaseProcessor());
    }
}
