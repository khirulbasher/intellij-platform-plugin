package com.lemon.idea.plugin.text.impl;

import com.lemon.framework.textprocessing.text.impl.ToUpperCaseProcessor;
import com.lemon.idea.plugin.text.TextAction;

public class ToUpperCase extends TextAction {
    public ToUpperCase() {
        super(new ToUpperCaseProcessor());
    }
}
