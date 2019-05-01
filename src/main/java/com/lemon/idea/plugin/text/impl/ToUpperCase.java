package com.lemon.idea.plugin.text.impl;

import com.lemon.framework.processing.textprocessing.text.textcase.ToUpperCaseProcessor;
import com.lemon.idea.plugin.text.TextAction;

public class ToUpperCase extends TextAction {
    public ToUpperCase() {
        super(new ToUpperCaseProcessor());
    }
}
