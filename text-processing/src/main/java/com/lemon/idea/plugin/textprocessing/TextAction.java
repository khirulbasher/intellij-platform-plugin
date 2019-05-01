package com.lemon.idea.plugin.textprocessing;

import com.intellij.openapi.editor.Caret;
import com.lemon.framework.base.processor.Processor;
import com.lemon.idea.plugin.AbstractAction;

import java.util.List;

@SuppressWarnings("WeakerAccess")
public abstract class TextAction extends AbstractAction {
    protected Processor<String,String> processor;

    protected TextAction() {
        this.processor = word->word;/*Empty Processor*/
    }


    public TextAction(Processor<String, String> processor) {
        this.processor = processor;
    }

    public void process(List<Caret> carets) {
        carets.forEach(this::process);
    }

    protected void process(Caret caret) {
        if(caret.hasSelection()) {
            String text=caret.getSelectedText();
            if(text!=null && !text.isEmpty())
                replace(this.process(text),caret.getSelectionStart(),caret.getSelectionEnd());
        }
    }

    @Override
    protected String process(String selectedText) {
        return processor.process(selectedText);
    }
}
