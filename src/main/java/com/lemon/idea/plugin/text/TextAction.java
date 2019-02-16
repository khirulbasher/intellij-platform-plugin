package com.lemon.idea.plugin.text;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;
import com.intellij.openapi.project.Project;
import com.lemon.framework.textprocessing.Processor;
import com.lemon.idea.plugin.AbstractAction;

@SuppressWarnings("WeakerAccess")
public abstract class TextAction extends AbstractAction {
    protected int selectionStart,selectionEnd;
    protected String selectedText;

    protected SelectionModel selectionModel;
    protected Editor editor;
    protected Project project;
    protected Processor<String,String> processor;

    protected TextAction() {
    }


    public TextAction(Processor<String, String> processor) {
        this.processor = processor;
    }

    @Override
    public void actionPerformed(AnActionEvent event) {
        try {
            this.selectionModel=selectionModel(event);
            this.selectionStart=selectionModel.getSelectionStart();
            this.selectionEnd=selectionModel.getSelectionEnd();
            this.selectedText=selectionModel.getSelectedText();
            this.editor=event.getData(CommonDataKeys.EDITOR);
            this.project=event.getProject();
            this.everythingOk=this.project!=null &&
                    this.selectedText!=null &&
                    !this.selectedText.isEmpty() &&
                    this.editor!=null &&
                    this.selectionModel!=null;
            replace(process(selectedText));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected String process(String selectedText) {
        return processor.process(selectedText);
    }

    protected void replace(String replacedText) {
        WriteCommandAction.runWriteCommandAction(project,()->editor.getDocument().replaceString(selectionStart,selectionEnd,replacedText));

    }

}
