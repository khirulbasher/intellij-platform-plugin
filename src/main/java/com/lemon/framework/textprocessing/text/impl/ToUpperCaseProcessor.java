package com.lemon.framework.textprocessing.text.impl;

public class ToUpperCaseProcessor extends CaseSwitchProcessor {
    @Override
    protected String doProcess(String text) {
        return switchOppositeCase(true,text);
    }
}
