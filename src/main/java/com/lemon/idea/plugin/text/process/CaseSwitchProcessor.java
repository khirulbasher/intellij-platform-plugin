package com.lemon.idea.plugin.text.process;

import com.lemon.idea.plugin.text.TextAction;

public class CaseSwitchProcessor extends TextAction {
    public CaseSwitchProcessor() {
        super(new com.lemon.framework.processing.textprocessing.text.textcase.CaseSwitchProcessor());
    }
}
