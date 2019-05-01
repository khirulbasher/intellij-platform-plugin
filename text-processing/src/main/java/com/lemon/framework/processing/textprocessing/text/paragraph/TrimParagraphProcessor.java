package com.lemon.framework.processing.textprocessing.text.paragraph;

import com.lemon.framework.processing.textprocessing.AbstractTextProcessor;

public class TrimParagraphProcessor extends AbstractTextProcessor {
    @Override
    protected String doProcess(String text) {
        return text.trim();
    }
}
