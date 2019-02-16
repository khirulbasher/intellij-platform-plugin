package com.lemon.framework.textprocessing.text.impl;

import com.lemon.framework.textprocessing.text.AbstractTextProcessor;
import com.lemon.framework.textprocessing.text.util.TextUtil;

import static com.lemon.framework.textprocessing.text.util.TextUtil.isLower;

public class CaseSwitchProcessor extends AbstractTextProcessor {
    @Override
    protected String doProcess(String text) {
        Character ch= TextUtil.findFirstAlphabet(text);
        if(ch==null) return text;
        return switchOppositeCase(isLower(ch),text);
    }

    protected String switchOppositeCase(boolean isLower,String text) {
        return isLower?text.toUpperCase():text.toLowerCase();
    }
}
