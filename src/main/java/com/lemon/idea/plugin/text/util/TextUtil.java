package com.lemon.idea.plugin.text.util;

public class TextUtil {
    public static boolean isUpper(char ch) {
        return ch>='A' && ch<='Z';
    }

    public static boolean isLower(char ch) {
        return ch>='a' && ch<='z';
    }

    public static char toUpper(char ch) {
        if(ch>='a' && ch<='z') return (char)('A'+(ch-'a'));
        return ch;
    }

    public static char toLower(char ch) {
        if(ch>='A' && ch<='Z') return (char)('a'+(ch-'A'));
        return ch;
    }

    public static Character findFirstAlphabet(String text) {
        for(char ch:text.toCharArray())
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) return ch;
        return null;
    }

    public static boolean hasAnyAlphabet(String text) {
        for(char ch:text.toCharArray())
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) return true;
        return false;
    }

    public static boolean hasAllCarsAnyWhere(String text,char...chars) {
        char[] textChars=text.toCharArray();
        int textChLen=textChars.length;
        int i=0;
        for(char providedChar:chars) {
            for(i=0;i<textChLen;i++)
                if(textChars[i]==providedChar) break;
            if(i==textChLen) return false;
        }
        return true;
    }

    public static boolean hasCarAnywhere(String text,char ch) {
        return hasAnyCharAnywhere(text,ch);
    }

    public static boolean hasAnyCharAnywhere(String text,char ...chars) {
        char[] textChars=text.toCharArray();
        for(char providedCh:chars)
            for(char textCh:textChars)
                if(textCh==providedCh) return true;
        return false;
    }
}
