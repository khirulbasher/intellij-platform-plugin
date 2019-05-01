package com.lemon.idea.plugin.text.process;

import com.lemon.idea.plugin.text.TextAction;

public class ToUpperCamelCaseProcessor extends TextAction {
    public ToUpperCamelCaseProcessor() {
        super(new com.lemon.framework.processing.textprocessing.text.textcase.ToUpperCamelCaseProcessor());
    }
}
