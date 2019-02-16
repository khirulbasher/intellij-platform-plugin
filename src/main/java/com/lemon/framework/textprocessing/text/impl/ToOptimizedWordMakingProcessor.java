package com.lemon.framework.textprocessing.text.impl;
/**
 * Make a Text to Word using separation process and keep each word's first character un-changed
 * and No Leading case
 */
public class ToOptimizedWordMakingProcessor extends AbstractTextCaseSeparateProcessor {
    public ToOptimizedWordMakingProcessor() {
        super(" ",ch->ch);
    }
}
