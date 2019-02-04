package com.lemon.idea.plugin.text.impl;

import static com.lemon.idea.plugin.text.util.TextUtil.toLower;
import static com.lemon.idea.plugin.text.util.TextUtil.toUpper;

public class UpperCamelToSnake extends CamelToSnake {

    @Override
    protected String toCamelCase(String text) {
        char[] chars=text.toCharArray();
        StringBuilder builder=new StringBuilder().append(toUpper(chars[0]));
        int len=chars.length;
        for(int i=1;i<len;i++) {
            char ch=chars[i];
            if(ch=='_') {
                i++;
                while (i<len && chars[i++]=='_');
                builder.append(toUpper(chars[--i]));
            }
            else builder.append(toLower(ch));
        }
        return builder.toString();
    }

    @Override
    protected String toSnackCase(String text) {
        return super.toSnackCase(text).toUpperCase();
    }
}
