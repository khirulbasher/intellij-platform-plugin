package com.lemon.framework.textprocessing;

/**
 * A Processor for Operational Purpose
 * Where it Takes an Input and after processing return back
 * the output
 * @param <I> The Input Type
 * @param <O> The Output Type which is Expect after processing
 */
public interface Processor<I,O> {
    /**
     * Process an Input and return an Output after Processing
     * @param input given Input
     * @return Processed Output
     */
    O process(I input);
}
