package com.lemon.idea.plugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;

public abstract class AbstractAction extends AnAction {
    protected boolean everythingOk=false;

    protected SelectionModel selectionModel(AnActionEvent event) {
        Editor editor= event.getData(CommonDataKeys.EDITOR);
        if(editor!=null) return editor.getSelectionModel();
        return null;
    }

    protected boolean isEverythingOk() {
        return this.everythingOk;
    }
}
