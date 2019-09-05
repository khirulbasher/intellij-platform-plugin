package com.lemon.idea.plugin.textprocessing.insert;

import com.intellij.openapi.editor.Caret;
import com.lemon.idea.plugin.AbstractAction;

import java.util.List;

public abstract class AbstractTextInsertingProcessor extends AbstractAction {

    @Override
    public void process(List<Caret> carets) {
        int index=0;
        for(Caret caret:carets) {
            replace(makeInsertText(index,caret,carets),caret.getSelectionStart(),caret.getSelectionEnd());
            index++;
        }
    }

    /**
     * Create a text for inserting
     * @param index The index of the caret
     * @param currentCaret The Current Caret information
     * @param carets
     * @return Processed Text to insert
     */
    protected abstract String makeInsertText(int index, Caret currentCaret, List<Caret> carets);

    @Override
    protected String process(String selectedText) {
        throw new RuntimeException("Not Implemented Yet");
    }
}
