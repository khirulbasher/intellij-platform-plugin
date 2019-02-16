package com.lemon.idea.plugin.text.impl;

import com.lemon.framework.textprocessing.Processor;
import com.lemon.framework.textprocessing.text.impl.*;
import com.lemon.framework.textprocessing.text.util.TextUtil;
import com.lemon.idea.plugin.text.TextAction;

public class CaseTypeSwitchCase extends TextAction {
    private Processor<String,String> toUpperCamelCase;
    private Processor<String,String> toLowerCamelCase;
    private Processor<String,String> toUpperSnakeCase;
    private Processor<String,String> toLowerSnakeCase;
    public CaseTypeSwitchCase() {
        super();
        toUpperCamelCase=new ToUpperCamelCaseProcessor();
        toLowerCamelCase=new ToLowerCamelCaseProcessor();
        toUpperSnakeCase=new ToUpperSnakeCaseProcessor();
        toLowerSnakeCase=new ToLowerSnakeCaseProcessor();
    }

    @Override
    protected String process(String selectedText) {
        Character firstChar=TextUtil.findFirstAlphabet(selectedText);
        if(firstChar==null || TextUtil.isUpper(firstChar)) {
            if (TextUtil.hasAnyCharAnywhere(selectedText, '_','-'))
                return toUpperCamelCase.process(selectedText);
            return toUpperSnakeCase.process(selectedText);
        }
        else {
            if (TextUtil.hasAnyCharAnywhere(selectedText, '_'))
                return toLowerCamelCase.process(selectedText);
            return toLowerSnakeCase.process(selectedText);
        }
    }
}
