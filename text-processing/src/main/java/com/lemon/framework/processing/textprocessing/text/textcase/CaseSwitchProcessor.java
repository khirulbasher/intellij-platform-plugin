package com.lemon.framework.processing.textprocessing.text.textcase;

import com.lemon.framework.processing.textprocessing.AbstractTextProcessor;
import com.lemon.framework.processing.textprocessing.util.TextUtil;

import static com.lemon.framework.processing.textprocessing.util.TextUtil.isLower;

public class CaseSwitchProcessor extends AbstractTextProcessor {
    @Override
    protected String doProcess(String text) {
        Character ch = TextUtil.findFirstAlphabet(text);
        if (ch == null) return text;
        return switchOppositeCase(isLower(ch), text);
    }

    protected String switchOppositeCase(boolean isLower, String text) {
        return isLower ? text.toUpperCase() : text.toLowerCase();
    }
}
