package com.lemon.framework.textprocessing.text;


import com.lemon.framework.textprocessing.Processor;

public abstract class AbstractTextProcessor  implements Processor<String,String> {

    @Override
    public String process(String input) {
        return doProcess(input);
    }

    protected abstract String doProcess(String text);
}
