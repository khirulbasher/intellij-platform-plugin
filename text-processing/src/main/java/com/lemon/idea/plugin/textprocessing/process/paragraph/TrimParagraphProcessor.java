package com.lemon.idea.plugin.textprocessing.process.paragraph;

import com.lemon.idea.plugin.textprocessing.TextAction;

public class TrimParagraphProcessor extends TextAction {
    public TrimParagraphProcessor() {
        super(new com.lemon.framework.processing.textprocessing.text.paragraph.TrimParagraphProcessor());
    }
}
