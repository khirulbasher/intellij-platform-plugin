package com.lemon.idea.plugin.textprocessing.process;

import com.lemon.idea.plugin.textprocessing.TextAction;

public class CaseSwitchProcessor extends TextAction {
    public CaseSwitchProcessor() {
        super(new com.lemon.framework.processing.textprocessing.text.textcase.CaseSwitchProcessor());
    }
}
