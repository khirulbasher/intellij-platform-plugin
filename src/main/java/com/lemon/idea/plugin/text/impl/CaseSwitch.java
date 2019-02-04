package com.lemon.idea.plugin.text.impl;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.command.WriteCommandAction;
import com.lemon.idea.plugin.text.TextAction;
import com.lemon.idea.plugin.text.TextUtil;

public class CaseSwitch extends TextAction {
    @Override
    public void actionPerformed(AnActionEvent event) {
        super.actionPerformed(event);
        if(!isEverythingOk()) return;
        TextUtil.TextStat textStat=textUtil.textStatus(selectedText);
        if(textStat.equals(TextUtil.TextStat.NO_ALPHABET)) return;
        String converted=textStat.equals(TextUtil.TextStat.LOWERCASE)?selectedText.toUpperCase():selectedText.toLowerCase();
        WriteCommandAction.runWriteCommandAction(event.getProject(),()->editor.getDocument().replaceString(selectionStart,selectionEnd,converted));
    }


}
