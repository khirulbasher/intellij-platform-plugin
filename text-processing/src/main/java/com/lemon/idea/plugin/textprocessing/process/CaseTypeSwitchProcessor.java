package com.lemon.idea.plugin.textprocessing.process;

import com.lemon.framework.base.processor.Processor;
import com.lemon.framework.processing.textprocessing.text.textcase.ToLowerCamelCaseProcessor;
import com.lemon.framework.processing.textprocessing.text.textcase.ToLowerSnakeCaseProcessor;
import com.lemon.framework.processing.textprocessing.text.textcase.ToUpperCamelCaseProcessor;
import com.lemon.framework.processing.textprocessing.text.textcase.ToUpperSnakeCaseProcessor;
import com.lemon.framework.processing.textprocessing.util.TextUtil;
import com.lemon.idea.plugin.textprocessing.TextAction;

public class CaseTypeSwitchProcessor extends TextAction {
    private Processor<String,String> toUpperCamelCase;
    private Processor<String,String> toLowerCamelCase;
    private Processor<String,String> toUpperSnakeCase;
    private Processor<String,String> toLowerSnakeCase;
    public CaseTypeSwitchProcessor() {
        super();
        toUpperCamelCase=new ToUpperCamelCaseProcessor();
        toLowerCamelCase=new ToLowerCamelCaseProcessor();
        toUpperSnakeCase=new ToUpperSnakeCaseProcessor();
        toLowerSnakeCase=new ToLowerSnakeCaseProcessor();
    }

    @Override
    protected String process(String selectedText) {
        Character firstChar= TextUtil.findFirstAlphabet(selectedText);
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
