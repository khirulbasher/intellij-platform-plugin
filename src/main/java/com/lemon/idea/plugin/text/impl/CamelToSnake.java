package com.lemon.idea.plugin.text.impl;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.lemon.idea.plugin.text.TextAction;

import static com.lemon.idea.plugin.text.util.TextUtil.hasAnyCharAnywhere;
import static com.lemon.idea.plugin.text.util.TextUtil.isUpper;

public class CamelToSnake extends TextAction {
    @Override
    public void actionPerformed(AnActionEvent event) {
        super.actionPerformed(event);
        if(!isEverythingOk()) return;
        boolean isCamel=!hasAnyCharAnywhere(selectedText,'_');
        replace(isCamel?toSnackCase(selectedText):toCamelCase(selectedText));
    }

    protected String toCamelCase(String text) {
        return text.replace("_","");
    }

    protected String toSnackCase(String text) {
        char[] chars=text.toCharArray();
        int len=chars.length;
        StringBuilder builder=new StringBuilder().append(chars[0]);
        for(int i=1;i<len;i++) {
            if(isUpper(chars[i])) {
                if(!isUpper(chars[i-1])) builder.append("_").append(chars[i]);
                i++;
                while (i < len && isUpper(chars[i]))
                    builder.append(chars[i++]);
                i--;
            }
            else builder.append(chars[i]);
        }
        return builder.toString();
    }
}
