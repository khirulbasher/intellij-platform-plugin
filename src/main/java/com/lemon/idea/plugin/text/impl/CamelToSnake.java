package com.lemon.idea.plugin.text.impl;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.lemon.idea.plugin.text.TextAction;

import static com.lemon.idea.plugin.text.util.TextUtil.*;

public class CamelToSnake extends TextAction {
    @Override
    public void actionPerformed(AnActionEvent event) {
        super.actionPerformed(event);
        if(!isEverythingOk()) return;
        boolean isCamel=!hasAnyCharAnywhere(selectedText,'_');
        replace(isCamel?toSnackCase(selectedText):toCamelCase(selectedText));
    }
}
