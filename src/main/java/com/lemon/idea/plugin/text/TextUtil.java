package com.lemon.idea.plugin.text;

public class TextUtil {
    public enum TextStat {
        NO_ALPHABET,UPPERCASE,LOWERCASE,SNACK_CASE,CAMEL_CASE
    }

    public static TextStat textStatus(String text) {
        for(char ch:text.toCharArray()) {
            if(isLower(ch)) return TextStat.LOWERCASE;
            if(isUpper(ch)) return TextStat.UPPERCASE;
        }
        return TextStat.NO_ALPHABET;
    }

    public static TextStat camelOrSnack(String text) {
        for(char ch:text.toCharArray()) {
            if(ch=='_') return TextStat.SNACK_CASE;
        }
        return TextStat.CAMEL_CASE;
    }

    public static boolean isUpper(char ch) {
        return ch>='A' && ch<='Z';
    }
    public static boolean isLower(char ch) {
        return ch>='a' && ch<='z';
    }
}
