package com.lemon.framework.processing.textprocessing.text.textcase;

/**
 * Just Separate the word by break-point and make every thing un-changed
 */
public class ToWordMakingProcessor extends AbstractTextCaseSeparateProcessor {
    public ToWordMakingProcessor() {
        super(" ", ch -> ch, ch -> ch);
    }
}
