package com.lemon.idea.plugin.textprocessing.process.textcase;

import com.lemon.idea.plugin.textprocessing.TextAction;

public class ToLowerCamelCaseProcessor extends TextAction {
    public ToLowerCamelCaseProcessor() {
        super(new com.lemon.framework.processing.textprocessing.text.textcase.ToLowerCamelCaseProcessor());
    }
}
