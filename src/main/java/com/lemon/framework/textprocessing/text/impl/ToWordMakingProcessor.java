package com.lemon.framework.textprocessing.text.impl;

/**
 * Just Separate the word by break-point and make every thing un-changed
 */
public class ToWordMakingProcessor extends AbstractTextCaseSeparateProcessor{
    public ToWordMakingProcessor() {
        super(" ", ch->ch,ch->ch);
    }
}
