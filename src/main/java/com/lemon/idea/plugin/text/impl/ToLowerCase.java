package com.lemon.idea.plugin.text.impl;

import com.lemon.framework.textprocessing.text.impl.ToLowerCaseProcessor;
import com.lemon.idea.plugin.text.TextAction;

public class ToLowerCase extends TextAction {
    public ToLowerCase() {
        super(new ToLowerCaseProcessor());
    }
}
