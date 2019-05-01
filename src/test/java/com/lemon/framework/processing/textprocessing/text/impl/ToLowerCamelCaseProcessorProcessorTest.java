package com.lemon.framework.processing.textprocessing.text.impl;

import com.lemon.framework.processing.textprocessing.text.TextProcessorTest;
import com.lemon.framework.processing.textprocessing.text.textcase.ToLowerCamelCaseProcessor;
import org.junit.Before;
import org.junit.Test;

public class ToLowerCamelCaseProcessorProcessorTest {
    private TextProcessorTest textProcessorTest;

    @Before
    public void setUp() throws Exception {
        textProcessorTest=new TextProcessorTest(new ToLowerCamelCaseProcessor());
    }

    @Test
    public void processor() {
        textProcessorTest.test();
    }
}