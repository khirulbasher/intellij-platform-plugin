package com.lemon.framework.processing.textprocessing.util;

import java.util.function.Function;

public class TextUtil {
    public static boolean isUpper(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    public static boolean isLower(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    public static boolean isAlphabet(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    public static boolean isNumber(char ch) {
        return ch >= '0' && ch <= '9';
    }

    /**
     * Detect That is the both character is upper case or lower-case
     *
     * @param ch1 first char
     * @param ch2 second char
     * @return true if they both are alphabet and both also upper or lower case
     */
    public static boolean isBothSameCase(char ch1, char ch2) {
        return (isAlphabet(ch1) && isAlphabet(ch2)) && (isLower(ch1) ? isLower(ch2) : isUpper(ch2));
    }

    public static char toUpper(char ch) {
        if (ch >= 'a' && ch <= 'z') return (char) ('A' + (ch - 'a'));
        return ch;
    }

    public static char toLower(char ch) {
        if (ch >= 'A' && ch <= 'Z') return (char) ('a' + (ch - 'A'));
        return ch;
    }

    public static Character findFirstAlphabet(String text) {
        for (char ch : text.toCharArray())
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) return ch;
        return null;
    }

    public static boolean hasAnyAlphabet(String text) {
        for (char ch : text.toCharArray())
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) return true;
        return false;
    }

    public static boolean hasAllCarsAnyWhere(String text, char... chars) {
        char[] textChars = text.toCharArray();
        int textChLen = textChars.length;
        int i = 0;
        for (char providedChar : chars) {
            for (i = 0; i < textChLen; i++)
                if (textChars[i] == providedChar) break;
            if (i == textChLen) return false;
        }
        return true;
    }

    public static boolean hasCarAnywhere(String text, char ch) {
        return hasAnyCharAnywhere(text, ch);
    }

    public static boolean hasAnyCharAnywhere(String text, char... chars) {
        char[] textChars = text.toCharArray();
        for (char providedCh : chars)
            for (char textCh : textChars)
                if (textCh == providedCh) return true;
        return false;
    }

    /**
     * Skip flow of character if the character is omitable by developer defined and return the after omit cursor point
     *
     * @param text The main text
     * @param from The Starting point from where it starts the omit check
     * @param ch   the character which would be omit
     * @return the after omit index
     */
    public static int omitChar(char[] text, int from, char ch) {
        return omitChar(text, text.length, from, ch);
    }

    /**
     * Skip flow of character if the character is omitable by developer defined and return the after omit cursor point
     *
     * @param text   The main text
     * @param length The text length
     * @param from   The Starting point from where it starts the omit check
     * @param ch     the character which would be omit
     * @return the after omit index
     */
    public static int omitChar(char[] text, int length, int from, char ch) {
        while (from < length && text[from++] == ch) ;
        return from == length ? length : from - 1;
    }

    /**
     * Skip flow of character if the character is omitable by developer defined and return the after omit cursor point
     *
     * @param text        The main text
     * @param from        The Starting point from where it starts the omit check
     * @param omitChecker The omit checker function
     * @return the after omit index
     */
    public static int omitChar(char[] text, int from, Function<Character, Boolean> omitChecker) {
        return omitChar(text, text.length, from, omitChecker);
    }

    /**
     * Skip flow of character if the character is omitable by developer defined and return the after omit cursor point
     *
     * @param text        The main text
     * @param length      The text length
     * @param from        The Starting point from where it starts the omit check
     * @param omitChecker The omit checker function
     * @return the after omit index
     */
    public static int omitChar(char[] text, int length, int from, Function<Character, Boolean> omitChecker) {
        while (from < length && omitChecker.apply(text[from++])) ;
        return from == length ? length : from - 1;
    }
}
