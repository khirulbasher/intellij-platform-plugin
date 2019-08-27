package com.lemon.idea.plugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.command.WriteCommandAction;
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

    /**
     * Process Multiple Caret
     * @param carets multiple caret
     */
    public abstract void process(List<Caret> carets);

    /**
     * Process The Text using process or any other way
     * @param selectedText textprocessing to process
     * @return processed textprocessing
     */
    protected abstract String process(String selectedText);

    protected void replace(String replacedText,int selectionStart,int selectionEnd) {
        WriteCommandAction.runWriteCommandAction(project,()->editor.getDocument().replaceString(selectionStart,selectionEnd,replacedText));
    }
}
