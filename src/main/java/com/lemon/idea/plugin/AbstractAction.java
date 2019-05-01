package com.lemon.idea.plugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Caret;
import com.intellij.openapi.editor.CaretModel;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;
import com.intellij.openapi.project.Project;

import java.util.List;

public abstract class AbstractAction extends AnAction {
    protected Editor editor;
    protected CaretModel caretModel;
    protected Project project;

    @Override
    public void actionPerformed(AnActionEvent event) {
        editor=event.getData(CommonDataKeys.EDITOR);
        if(editor == null) return;
        project=editor.getProject();
        caretModel=editor.getCaretModel();
        process(caretModel.getAllCarets());
    }

    public void process(List<Caret> carets) {
        carets.forEach(this::process);
    }

    protected abstract void process(Caret caret);
}
