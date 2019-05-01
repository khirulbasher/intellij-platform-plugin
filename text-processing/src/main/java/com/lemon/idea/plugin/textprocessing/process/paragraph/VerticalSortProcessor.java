package com.lemon.idea.plugin.textprocessing.process.paragraph;

import com.lemon.framework.processing.textprocessing.text.paragraph.SortParagraphProcessor;
import com.lemon.idea.plugin.textprocessing.TextAction;

public class VerticalSortProcessor extends TextAction {
    public VerticalSortProcessor() {
        super(new SortParagraphProcessor(SortParagraphProcessor.SortType.VERTICAL, SortParagraphProcessor.SortOrder.ASC));
    }
}
