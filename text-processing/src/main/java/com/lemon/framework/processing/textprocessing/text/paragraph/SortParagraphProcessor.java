package com.lemon.framework.processing.textprocessing.text.paragraph;

import com.lemon.framework.processing.textprocessing.text.AbstractParagraphProcessor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortParagraphProcessor extends AbstractParagraphProcessor {
    protected SortType sortType;
    protected SortOrder sortOrder;
    protected String wordSeparatingRegex;

    /**
     * If Passes any value is Null then it takes the default value
     *
     * @param sortType  default value NONE
     * @param sortOrder default value NONE
     */
    public SortParagraphProcessor(SortType sortType, SortOrder sortOrder) {
        this(null, sortType, sortOrder);
    }

    /**
     * If Passes any value is Null then it takes the default value
     *
     * @param lineSeparatingRegex default value is '\n'
     * @param sortType            default value NONE
     * @param sortOrder           default value NONE
     */
    public SortParagraphProcessor(String lineSeparatingRegex, SortType sortType, SortOrder sortOrder) {
        this(null, sortType, sortOrder, null);
    }

    /**
     * If Passes any value is Null then it takes the default value
     *
     * @param lineSeparatingRegex default value is '\n'
     * @param sortType            default value NONE
     * @param sortOrder           default value NONE
     * @param wordSeparatingRegex default value blank-space
     */
    public SortParagraphProcessor(String lineSeparatingRegex, SortType sortType, SortOrder sortOrder, String wordSeparatingRegex) {
        super(lineSeparatingRegex == null ? "\n" : lineSeparatingRegex);
        this.sortType = sortType == null ? SortType.NONE : sortType;
        this.sortOrder = sortOrder == null ? SortOrder.NONE : sortOrder;
        this.wordSeparatingRegex = wordSeparatingRegex == null ? " " : wordSeparatingRegex;
    }

    @Override
    protected String doProcess(String[] lines) {
        List<String> sortedLines = new ArrayList<>();


        for (String line : lines) {
            StringBuilder builder = new StringBuilder();
            String[] words = line.split(wordSeparatingRegex);
            if(sortType.equals(SortType.BOTH) || sortType.equals(SortType.HORIZONTAL)) sortArray(words, sortOrder);
            for (String word : words)
                builder.append(word).append(wordSeparatingRegex);
            builder.append(lineSeparatingRegex);
            sortedLines.add(builder.toString());
        }

        if(sortType.equals(SortType.BOTH) || sortType.equals(SortType.VERTICAL)) sortList(sortedLines, sortOrder);
        StringBuilder builder = new StringBuilder();
        sortedLines.forEach(line -> builder.append(line));
        return builder.toString();
    }

    protected void sortArray(String[] words, SortOrder sortOrder) {
        switch (sortOrder) {
            case ASC:
                Arrays.sort(words, String::compareTo);
                break;
            case DESC:
                Arrays.sort(words, Comparator.reverseOrder());
                break;
            case NONE:
            default:
                break;
        }
    }

    protected void sortList(List<String> list, SortOrder sortOrder) {
        switch (sortOrder) {
            case ASC:
                list.sort(String::compareTo);
                break;
            case DESC:
                list.sort(Comparator.reverseOrder());
                break;
            case NONE:
            default:
                break;
        }
    }


    public enum SortType {
        NONE, HORIZONTAL, VERTICAL, BOTH
    }

    public enum SortOrder {
        NONE, ASC, DESC
    }

}
