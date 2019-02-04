package com.lemon.idea.plugin.text.impl;

public class LowerCamelToSnake extends UpperCamelToSnake {

    @Override
    protected String toCamelCase(String text) {
        String converted = super.toCamelCase(text);
        return textUtil.toLower(converted.charAt(0))+converted.substring(1);
    }

    @Override
    protected String toSnackCase(String text) {
        return super.toSnackCase(text).toLowerCase();
    }
}
