package com.lemon.idea.plugin.text.impl;

import static com.lemon.idea.plugin.text.util.TextUtil.toLower;

public class SnakeToLowerCamel extends SnakeToUpperCamel {

    @Override
    protected String toCamelCase(String text) {
        String converted = super.toCamelCase(text);
        return toLower(converted.charAt(0))+converted.substring(1);
    }
}
