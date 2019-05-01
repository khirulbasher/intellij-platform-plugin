package com.lemon.idea.plugin.textprocessing.insert;

import com.lemon.idea.plugin.AbstractAction;

public abstract class AbstractTextInsertingProcessor extends AbstractAction {

    @Override
    protected String process(String selectedText) {
        throw new RuntimeException("Not Implemented Yet");
    }
}
