package com.lemon.idea.plugin.text.impl;

import com.lemon.framework.textprocessing.text.impl.ToWordMakingProcessor;
import com.lemon.idea.plugin.text.TextAction;

public class ToWordMaking extends TextAction {
    public ToWordMaking() {
        super(new ToWordMakingProcessor());
    }
}
