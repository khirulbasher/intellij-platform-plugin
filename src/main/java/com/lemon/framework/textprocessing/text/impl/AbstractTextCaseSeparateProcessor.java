package com.lemon.framework.textprocessing.text.impl;

import com.lemon.framework.textprocessing.text.AbstractTextCaseProcessor;
import com.lemon.framework.textprocessing.text.util.TextUtil;

import java.util.function.Function;

import static com.lemon.framework.textprocessing.text.util.TextUtil.isBothSameCase;
import static com.lemon.framework.textprocessing.text.util.TextUtil.isUpper;

public abstract class AbstractTextCaseSeparateProcessor extends AbstractTextCaseProcessor {
    protected String separatedWith=" ";
    protected Function<Character,Character> applyWhenFoundSeparatedEntryPoint=TextUtil::toUpper;
    protected Function<Character,Character> applyAfterEntryPoint=TextUtil::toLower;

    public AbstractTextCaseSeparateProcessor(String separatedWith) {
        this.separatedWith = separatedWith;
    }

    public AbstractTextCaseSeparateProcessor(String separatedWith, Function<Character, Character> applyWhenFoundSeparatedEntryPoint) {
        this.separatedWith = separatedWith;
        this.applyWhenFoundSeparatedEntryPoint = applyWhenFoundSeparatedEntryPoint;
    }

    public AbstractTextCaseSeparateProcessor(String separatedWith, Function<Character, Character> applyWhenFoundSeparatedEntryPoint, Function<Character, Character> applyAfterEntryPoint) {
        this.separatedWith = separatedWith;
        this.applyWhenFoundSeparatedEntryPoint = applyWhenFoundSeparatedEntryPoint;
        this.applyAfterEntryPoint = applyAfterEntryPoint;
    }

    @Override
    protected String doProcess(String text) {
        char[] chars= text.toCharArray();
        int len=chars.length;
        int i= 0;
        if(isOmittedChar(chars[i]))
            i= TextUtil.omitChar(chars,len,0, this::isOmittedChar);
        StringBuilder builder=new StringBuilder().append(applyWhenFoundSeparatedEntryPoint.apply(chars[i++]));
        while (i<len) {
            if(TextUtil.isNumber(chars[i])) { /*If a/sequence of Number Found then after number first letter Capitalize*/
                while (i<len && TextUtil.isNumber(chars[i]))
                    builder.append(chars[i++]);
                if(i<len) builder.append(separatedWith).append(applyWhenFoundSeparatedEntryPoint.apply(chars[i]));
            }
            else if(isOmittedChar(chars[i])) { /*If OMITTED CHAR such as '_' Found then after char omitted, first letter Capitalize*/
                i= TextUtil.omitChar(chars,len,i, this::isOmittedChar);
                if(i<len)builder.append(separatedWith).append(applyWhenFoundSeparatedEntryPoint.apply(chars[i]));
            }
            else {
                if(isBothSameCase(chars[i-1],chars[i]) || isUpper(builder.charAt(builder.length()-1)))
                    builder.append(applyAfterEntryPoint.apply(chars[i]));
                else builder.append(separatedWith).append(applyWhenFoundSeparatedEntryPoint.apply(chars[i]));
            }
            i++;
        }

        return builder.toString();
    }
}
