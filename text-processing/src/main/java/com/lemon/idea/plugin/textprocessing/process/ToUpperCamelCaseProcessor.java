package com.lemon.idea.plugin.textprocessing.process;

import com.lemon.idea.plugin.textprocessing.TextAction;

public class ToUpperCamelCaseProcessor extends TextAction {
    public ToUpperCamelCaseProcessor() {
        super(new com.lemon.framework.processing.textprocessing.text.textcase.ToUpperCamelCaseProcessor());
    }
}
