package com.lemon.idea.plugin.text.process;

import com.lemon.idea.plugin.text.TextAction;

public class ToUpperCaseProcessor extends TextAction {
    public ToUpperCaseProcessor() {
        super(new com.lemon.framework.processing.textprocessing.text.textcase.ToUpperCaseProcessor());
    }
}
