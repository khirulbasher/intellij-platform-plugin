package com.lemon.framework.processing.textprocessing;


import com.lemon.framework.base.processor.Processor;

public abstract class AbstractTextProcessor implements Processor<String, String> {

    @Override
    public String process(String input) {
        return doProcess(input);
    }

    protected abstract String doProcess(String text);
}
