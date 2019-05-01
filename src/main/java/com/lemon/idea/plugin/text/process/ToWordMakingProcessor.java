package com.lemon.idea.plugin.text.process;

import com.lemon.idea.plugin.text.TextAction;

public class ToWordMakingProcessor extends TextAction {
    public ToWordMakingProcessor() {
        super(new com.lemon.framework.processing.textprocessing.text.textcase.ToWordMakingProcessor());
    }
}
