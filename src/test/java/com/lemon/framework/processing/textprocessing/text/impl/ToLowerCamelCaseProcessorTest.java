package com.lemon.framework.processing.textprocessing.text.impl;

import com.lemon.framework.processing.textprocessing.text.TextProcessorTest;
import org.junit.Before;
import org.junit.Test;

public class ToLowerCamelCaseProcessorTest {
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