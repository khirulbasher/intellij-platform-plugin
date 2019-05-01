package com.lemon.idea.plugin.text.impl;

import com.lemon.framework.processing.textprocessing.text.textcase.ToWordMakingProcessor;
import com.lemon.idea.plugin.text.TextAction;

public class ToWordMaking extends TextAction {
    public ToWordMaking() {
        super(new ToWordMakingProcessor());
    }
}
