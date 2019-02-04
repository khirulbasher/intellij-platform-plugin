package com.lemon.idea.plugin.text;

public class TextUtil {
    public enum TextStat {
        NO_ALPHABET,UPPERCASE,LOWERCASE,SNACK_CASE,CAMEL_CASE
    }

    public TextStat textStatus(String text) {
        for(char ch:text.toCharArray()) {
            if(isLower(ch)) return TextStat.LOWERCASE;
            if(isUpper(ch)) return TextStat.UPPERCASE;
        }
        return TextStat.NO_ALPHABET;
    }

    public TextStat isCamelOrSnack(String text) {
        for(char ch:text.toCharArray()) {
            if(ch=='_') return TextStat.SNACK_CASE;
        }
        return TextStat.CAMEL_CASE;
    }

    public boolean isUpper(char ch) {
        return ch>='A' && ch<='Z';
    }

    public boolean isLower(char ch) {
        return ch>='a' && ch<='z';
    }

    public char toUpper(char ch) {
        if(ch>='a' && ch<='z') return (char)('A'+(ch-'a'));
        return ch;
    }

    public char toLower(char ch) {
        if(ch>='A' && ch<='Z') return (char)('a'+(ch-'A'));
        return ch;
    }
}
