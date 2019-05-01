package com.lemon.framework.processing.textprocessing.text.textcase;

import com.lemon.framework.processing.textprocessing.util.TextUtil;

public class ToLowerCamelCaseProcessor extends ToUpperCamelCaseProcessor {
    public ToLowerCamelCaseProcessor() {
        super();
    }

    @Override
    protected String doProcess(String text) {
        String processed = super.doProcess(text);
        return TextUtil.toLower(processed.charAt(0)) + processed.substring(1);
    }
}
