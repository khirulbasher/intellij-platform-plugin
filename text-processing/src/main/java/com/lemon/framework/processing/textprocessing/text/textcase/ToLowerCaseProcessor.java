package com.lemon.framework.processing.textprocessing.text.textcase;

public class ToLowerCaseProcessor extends CaseSwitchProcessor {
    @Override
    protected String doProcess(String text) {
        return switchOppositeCase(false, text);
    }
}
