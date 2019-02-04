package com.lemon.idea.plugin.text.impl;

import org.junit.Test;

public class UpperCamelToSnakeTest {
    UpperCamelToSnake camelToSnake=new UpperCamelToSnake();

    @Test
    public void toCamelCase() {
        String text="JHVUUI_GYVUI_GIBUJU";
        String txyt="JHVUUI_GYVUI_GIBUJU";
        String camCase=camelToSnake.toCamelCase(text);
        System.out.print(camCase);
    }
}