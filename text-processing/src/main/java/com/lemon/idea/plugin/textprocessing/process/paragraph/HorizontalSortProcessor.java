package com.lemon.idea.plugin.textprocessing.process.paragraph;

import com.lemon.framework.processing.textprocessing.text.paragraph.SortParagraphProcessor;
import com.lemon.idea.plugin.textprocessing.TextAction;

public class HorizontalSortProcessor extends TextAction {
    public HorizontalSortProcessor() {
        super(new SortParagraphProcessor(SortParagraphProcessor.SortType.HORIZONTAL, SortParagraphProcessor.SortOrder.ASC));
    }
}
