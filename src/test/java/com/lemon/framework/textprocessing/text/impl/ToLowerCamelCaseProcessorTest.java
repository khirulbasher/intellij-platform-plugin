package com.lemon.framework.textprocessing.text.impl;

import com.lemon.framework.textprocessing.text.TextProcessorTest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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