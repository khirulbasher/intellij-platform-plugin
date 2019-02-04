package com.lemon.idea.plugin.text.impl;

public class UpperCamelToSnake extends CamelToSnake {

    @Override
    protected String toCamelCase(String text) {
        char[] chars=text.toCharArray();
        StringBuilder builder=new StringBuilder().append(textUtil.toUpper(chars[0]));
        int len=chars.length;
        for(int i=1;i<len;i++) {
            char ch=chars[i];
            if(ch=='_') {
                i++;
                while (i<len && chars[i++]=='_');
                builder.append(textUtil.toUpper(chars[--i]));
            }
            else builder.append(textUtil.toLower(ch));
        }
        return builder.toString();
    }

    @Override
    protected String toSnackCase(String text) {
        return super.toSnackCase(text).toUpperCase();
    }
}
