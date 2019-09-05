package com.lemon.framework.processing.textprocessing.text;

import com.lemon.framework.processing.textprocessing.AbstractTextProcessor;

public abstract class AbstractParagraphProcessor extends AbstractTextProcessor {
    protected String lineSeparatingRegex = "\n";

    public AbstractParagraphProcessor() {
    }

    public AbstractParagraphProcessor(String lineSeparatingRegex) {
        this.lineSeparatingRegex = lineSeparatingRegex;
    }

    @Override
    protected String doProcess(String text) {
        return doProcess(text.split(lineSeparatingRegex));
    }

    protected abstract String doProcess(String[] lines);
}
