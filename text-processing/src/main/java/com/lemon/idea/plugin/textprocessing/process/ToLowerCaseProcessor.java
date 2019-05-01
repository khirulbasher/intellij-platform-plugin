package com.lemon.idea.plugin.textprocessing.process;

import com.lemon.idea.plugin.textprocessing.TextAction;

public class ToLowerCaseProcessor extends TextAction {
    public ToLowerCaseProcessor() {
        super(new com.lemon.framework.processing.textprocessing.text.textcase.ToLowerCaseProcessor());
    }
}
