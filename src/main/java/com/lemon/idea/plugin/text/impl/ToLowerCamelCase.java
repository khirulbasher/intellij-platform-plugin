package com.lemon.idea.plugin.text.impl;

import com.lemon.framework.textprocessing.text.impl.ToLowerCamelCaseProcessor;
import com.lemon.idea.plugin.text.TextAction;

public class ToLowerCamelCase extends TextAction {
    public ToLowerCamelCase() {
        super(new ToLowerCamelCaseProcessor());
    }
}
