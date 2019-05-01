package com.lemon.idea.plugin.textprocessing.process;

import com.lemon.idea.plugin.textprocessing.TextAction;

public class ToUpperCaseProcessor extends TextAction {
    public ToUpperCaseProcessor() {
        super(new com.lemon.framework.processing.textprocessing.text.textcase.ToUpperCaseProcessor());
    }
}
