package com.lemon.idea.plugin.textprocessing.insert;

import com.intellij.openapi.editor.Caret;

public class NumberSequenceInsertingProcessor extends AbstractTextInsertingProcessor{

    @Override
    protected String makeInsertText(int index, Caret currentCaret) {
        return ""+index;
    }
}
