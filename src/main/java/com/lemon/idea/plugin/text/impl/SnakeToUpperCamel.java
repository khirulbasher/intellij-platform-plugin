package com.lemon.idea.plugin.text.impl;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.lemon.idea.plugin.text.TextAction;

public class SnakeToUpperCamel extends TextAction {
    @Override
    public void actionPerformed(AnActionEvent event) {
        super.actionPerformed(event);
        if(!isEverythingOk()) return;
        replace(toCamelCase(selectedText));
    }

}
