package com.lemon.idea.plugin.textprocessing.process.paragraph;

import com.lemon.framework.processing.textprocessing.text.paragraph.SortParagraphProcessor;
import com.lemon.idea.plugin.textprocessing.TextAction;

public class ToSortParagraphProcessor extends TextAction {
    public ToSortParagraphProcessor() {
        super(new SortParagraphProcessor(SortParagraphProcessor.SortType.BOTH, SortParagraphProcessor.SortOrder.ASC));
    }
}
