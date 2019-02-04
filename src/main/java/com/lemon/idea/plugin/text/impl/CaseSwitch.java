package com.lemon.idea.plugin.text.impl;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.lemon.idea.plugin.text.TextAction;
import com.lemon.idea.plugin.text.util.TextUtil;

import static com.lemon.idea.plugin.text.util.TextUtil.isLower;

public class CaseSwitch extends TextAction {
    @Override
    public void actionPerformed(AnActionEvent event) {
        super.actionPerformed(event);
        if(!isEverythingOk()) return;
        Character ch=TextUtil.findFirstAlphabet(selectedText);
        if(ch==null) return;
        replace(isLower(ch)?selectedText.toUpperCase():selectedText.toLowerCase());
    }


}
