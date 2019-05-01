package com.lemon.framework.processing.textprocessing.text.textcase;

public class ToUpperCaseProcessor extends CaseSwitchProcessor {
    @Override
    protected String doProcess(String text) {
        return switchOppositeCase(true, text);
    }
}
