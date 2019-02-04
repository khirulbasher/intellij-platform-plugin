package com.lemon.idea.plugin.text;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;
import com.lemon.idea.plugin.AbstractAction;

@SuppressWarnings("WeakerAccess")
public abstract class TextAction extends AbstractAction {
    protected int selectionStart,selectionEnd;
    protected String selectedText;

    protected SelectionModel selectionModel;
    protected Editor editor;
    protected TextUtil textUtil;

    public TextAction() {
        this.textUtil = new TextUtil();
    }

    @Override
    public void actionPerformed(AnActionEvent event) {
        try {
            this.selectionModel=selectionModel(event);
            this.selectionStart=selectionModel.getSelectionStart();
            this.selectionEnd=selectionModel.getSelectionEnd();
            this.selectedText=selectionModel.getSelectedText();
            this.editor=event.getData(CommonDataKeys.EDITOR);
            this.everythingOk=this.selectedText!=null && !this.selectedText.isEmpty() && this.editor!=null && this.selectionModel!=null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
