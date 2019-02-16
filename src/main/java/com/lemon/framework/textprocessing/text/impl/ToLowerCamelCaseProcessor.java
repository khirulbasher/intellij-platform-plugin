package com.lemon.framework.textprocessing.text.impl;

import com.lemon.framework.textprocessing.text.util.TextUtil;

public class ToLowerCamelCaseProcessor extends ToUpperCamelCaseProcessor {
    public ToLowerCamelCaseProcessor() {
        super(TextUtil::toLower);
    }
}
