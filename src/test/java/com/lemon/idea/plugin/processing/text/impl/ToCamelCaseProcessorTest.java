package com.lemon.idea.plugin.processing.text.impl;

import com.lemon.idea.plugin.processing.Processor;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToCamelCaseProcessorTest {
    protected String text="helloWorld";
    private Processor processor=new ToCamelCaseProcessor();

    @Test
    public void doProcess() {
        assertEquals(text,processor.process(text));
    }
}