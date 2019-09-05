package com.lemon.framework.processing.textprocessing.text.paragraph;

import com.lemon.framework.base.exception.runtime.ObjectInstantiateError;
import com.lemon.framework.processing.textprocessing.AbstractTextProcessor;
import com.lemon.framework.processing.textprocessing.util.TextUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Trim The paragraph, it generally reduce leading[more than one or provided count] character with it's correspondent
 * character.
 */
public class TrimParagraphProcessor extends AbstractTextProcessor {
    private final CharMap charMap;

    public TrimParagraphProcessor() {
        this.charMap = new CharMap();
        this.charMap.put(' ',new TrimProvider(" "));
    }

    public TrimParagraphProcessor(CharMap characterMap) {
        this();
        this.charMap.putAll(characterMap);
    }

    public TrimParagraphProcessor addCharMap(char toReplace, String replacedWith) {
        charMap.put(toReplace,new TrimProvider(replacedWith));
        return this;
    }

    public TrimParagraphProcessor addCharMap(char toReplace, TrimProvider trimProvider) {
        charMap.put(toReplace,trimProvider);
        return this;
    }


    @Override
    protected String doProcess(String text) {
        String[] lines=text.split("\n");
        if(lines.length>1) {
            StringBuilder builder=new StringBuilder();
            for(String line:lines)
                if(!line.isEmpty()) builder.append(processInternally(line.trim())).append('\n');
            return builder.toString();
        }
        return processInternally(text.trim());
    }

    protected String processInternally(String text) {
        StringBuilder builder=new StringBuilder();
        char[] textChars=text.toCharArray();
        char prevChar=textChars[0];
        builder.append(prevChar);
        char currentChar;
        for(int index=1;index<textChars.length;index++) {
            currentChar=textChars[index];
            if(Character.toLowerCase(prevChar) == Character.toLowerCase(currentChar)) { /*For Any Case*/
                TrimProvider trimProvider=charMap.get(Character.toLowerCase(currentChar));
                /*Check if the case mismatch*/
                if(trimProvider != null && (currentChar == prevChar || trimProvider.caseIgnoring)) {
                    final int prevIndex=index-1;
                    while (index<textChars.length && (textChars[index]==prevChar || (trimProvider.caseIgnoring && Character.toLowerCase(textChars[index])==Character.toLowerCase(prevChar)))) {
                        index++;
                    }
                    final int postIndex=index;
                    if(postIndex-prevIndex>=trimProvider.countThreshold) builder.deleteCharAt(builder.length()-1).append(trimProvider.replacedString);
                    else builder.append(TextUtil.generate(currentChar,postIndex-prevIndex-1));
                    index--;
                    continue;
                }
            }

            prevChar=currentChar;
            builder.append(currentChar);
        }
        return builder.toString();
    }

    public static class TrimProvider {
        public String replacedString;
        public int countThreshold;
        public boolean caseIgnoring;

        public TrimProvider(String replacedString) {
            this(replacedString,2);
        }

        public TrimProvider(String replacedString, int countThreshold) {
            this(replacedString,countThreshold,false);
        }

        public TrimProvider(String replacedString, int countThreshold, boolean caseIgnoring) {
            this.replacedString = replacedString;
            if(countThreshold<2) throw new ObjectInstantiateError("Counter Threshold must be greater than 1");
            this.countThreshold = countThreshold;
            this.caseIgnoring = caseIgnoring;
        }
    }

    public static class CharMap extends HashMap<Character,TrimProvider> {
        @Override
        public TrimProvider put(Character key, TrimProvider value) {
            return super.put(Character.toLowerCase(key), value);
        }
    }
}
