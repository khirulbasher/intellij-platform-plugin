package com.lemon.idea.plugin.text.process;

import com.lemon.idea.plugin.text.TextAction;

public class ToLowerCaseProcessor extends TextAction {
    public ToLowerCaseProcessor() {
        super(new com.lemon.framework.processing.textprocessing.text.textcase.ToLowerCaseProcessor());
    }
}
