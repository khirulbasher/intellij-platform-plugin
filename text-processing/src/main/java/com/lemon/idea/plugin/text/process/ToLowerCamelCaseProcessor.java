package com.lemon.idea.plugin.text.process;

import com.lemon.idea.plugin.text.TextAction;

public class ToLowerCamelCaseProcessor extends TextAction {
    public ToLowerCamelCaseProcessor() {
        super(new com.lemon.framework.processing.textprocessing.text.textcase.ToLowerCamelCaseProcessor());
    }
}
