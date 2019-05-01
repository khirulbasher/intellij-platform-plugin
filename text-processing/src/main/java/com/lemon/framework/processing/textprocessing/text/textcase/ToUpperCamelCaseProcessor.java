package com.lemon.framework.processing.textprocessing.text.textcase;


import java.util.function.Function;

/**
 * It's Working procedure is great.
 * When it try to make a textprocessing to camel case i.e Upper Camel Case,
 * it at first omitted it's omitable characters, and if found any leading character's like continuous upper-case
 * or continuous lower case then it make the first char to upper and leftover to lower
 */
@SuppressWarnings("FieldCanBeLocal")
public class ToUpperCamelCaseProcessor extends AbstractTextCaseSeparateProcessor {

    public ToUpperCamelCaseProcessor() {
        super("");
    }

    public ToUpperCamelCaseProcessor(Function<Character, Character> applyWhenFoundSeparatedEntryPoint) {
        super("", applyWhenFoundSeparatedEntryPoint);
    }
}
