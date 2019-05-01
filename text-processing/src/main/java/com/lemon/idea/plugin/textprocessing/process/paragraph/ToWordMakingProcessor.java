package com.lemon.idea.plugin.textprocessing.process.paragraph;

import com.lemon.idea.plugin.textprocessing.TextAction;

public class ToWordMakingProcessor extends TextAction {
    public ToWordMakingProcessor() {
        super(new com.lemon.framework.processing.textprocessing.text.textcase.ToWordMakingProcessor());
    }
}
