package com.lemon.framework.textprocessing.text.impl;

import static com.lemon.framework.textprocessing.text.util.TextUtil.toLower;

public class ToLowerCamelCaseProcessor extends ToUpperCamelCaseProcessor {
    public ToLowerCamelCaseProcessor() {
        super();
    }

    @Override
    protected String doProcess(String text) {
        String processed = super.doProcess(text);
        return toLower(processed.charAt(0))+processed.substring(1);
    }
}
