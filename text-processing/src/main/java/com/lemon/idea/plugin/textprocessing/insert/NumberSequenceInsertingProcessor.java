package com.lemon.idea.plugin.textprocessing.insert;

import com.intellij.openapi.editor.Caret;

import java.util.List;

public class NumberSequenceInsertingProcessor extends AbstractTextInsertingProcessor{


    @Override
    public void process(List<Caret> carets) {
        int index=0;
        for(Caret caret:carets) {
            replace(""+index,caret.getSelectionStart(),caret.getSelectionEnd());
            index++;
        }
    }
}
