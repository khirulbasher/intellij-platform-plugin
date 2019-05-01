package com.lemon.framework.processing.textprocessing.text.textcase;

/**
 * Make a Text to Word using separation process and keep each word's first character un-changed
 * and No Leading case
 */
public class ToOptimizedWordMakingProcessor extends AbstractTextCaseSeparateProcessor {
    public ToOptimizedWordMakingProcessor() {
        super(" ", ch -> ch);
    }
}
