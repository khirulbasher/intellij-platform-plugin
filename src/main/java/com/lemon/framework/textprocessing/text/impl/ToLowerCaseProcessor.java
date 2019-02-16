package com.lemon.framework.textprocessing.text.impl;

public class ToLowerCaseProcessor extends CaseSwitchProcessor {
    @Override
    protected String doProcess(String text) {
        return switchOppositeCase(false,text);
    }
}
