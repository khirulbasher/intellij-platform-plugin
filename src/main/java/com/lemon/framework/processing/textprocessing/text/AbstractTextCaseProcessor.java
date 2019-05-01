package com.lemon.framework.processing.textprocessing.text;

import com.lemon.framework.processing.textprocessing.AbstractTextProcessor;
import com.lemon.framework.processing.textprocessing.util.Range;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTextCaseProcessor extends AbstractTextProcessor {
    protected List<Character> acceptedChars;
    protected List<Range> acceptedCharRange;

    public AbstractTextCaseProcessor() {
        this.acceptedChars = new ArrayList<>();
        this.acceptedCharRange = new ArrayList<>();
        addAcceptedCharRange('0', '9');
        addAcceptedCharRange('a', 'z');
        addAcceptedCharRange('A', 'Z');
    }

    protected boolean isOmittedChar(char ch) {
        for (Range range : acceptedCharRange)
            if (ch >= range.from && ch <= range.to) return false;
        for (char acceptedChar : acceptedChars)
            if (ch == acceptedChar) return false;
        return true;
    }

    public void addAcceptedChar(char ch) {
        this.acceptedChars.add(ch);
    }

    public void addAcceptedCharRange(int from, int to) {
        addAcceptedCharRange(new Range(from, to));
    }

    public void addAcceptedCharRange(Range charRange) {
        this.acceptedCharRange.add(charRange);
    }
}
