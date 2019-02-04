package com.lemon.idea.plugin.text.impl;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.command.WriteCommandAction;
import com.lemon.idea.plugin.text.TextAction;
import com.lemon.idea.plugin.text.TextUtil;

public class CamelToSnake extends TextAction {
    @Override
    public void actionPerformed(AnActionEvent event) {
        super.actionPerformed(event);
        if(!isEverythingOk()) return;
        TextUtil.TextStat textStat=textUtil.isCamelOrSnack(selectedText);
        String converted=textStat.equals(TextUtil.TextStat.CAMEL_CASE)?toSnackCase(selectedText):toCamelCase(selectedText);
        WriteCommandAction.runWriteCommandAction(event.getProject(),()->editor.getDocument().replaceString(selectionStart,selectionEnd,converted));
    }

    protected String toCamelCase(String text) {
        return text.replace("_","");
        /*char[] chars=text.toCharArray();
        int len=chars.length;
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<len;i++) {
            if (chars[i] == '_') {
                while (i + 1 < len && chars[++i] == '_') ;
            }
            builder.append(chars[i]);
        }
        return builder.toString();*/
    }

    protected String toSnackCase(String text) {
        char[] chars=text.toCharArray();
        int len=chars.length;
        StringBuilder builder=new StringBuilder().append(chars[0]);
        for(int i=1;i<len;i++) {
            if(textUtil.isUpper(chars[i])) {
                if(!textUtil.isUpper(chars[i-1])) builder.append("_").append(chars[i]);
                i++;
                while (i < len && textUtil.isUpper(chars[i]))
                    builder.append(chars[i++]);
                i--;
            }
            else builder.append(chars[i]);
        }
        return builder.toString();
    }
}
