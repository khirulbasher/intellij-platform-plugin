package com.lemon.idea.plugin.text;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;
import com.intellij.openapi.project.Project;
import com.lemon.idea.plugin.AbstractAction;
import com.lemon.idea.plugin.text.util.TextUtil;

import static com.lemon.idea.plugin.text.util.TextUtil.isUpper;
import static com.lemon.idea.plugin.text.util.TextUtil.toLower;
import static com.lemon.idea.plugin.text.util.TextUtil.toUpper;

@SuppressWarnings("WeakerAccess")
public abstract class TextAction extends AbstractAction {
    protected int selectionStart,selectionEnd;
    protected String selectedText;

    protected SelectionModel selectionModel;
    protected Editor editor;
    protected Project project;

    public TextAction() {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void replace(String replacedText) {
        WriteCommandAction.runWriteCommandAction(project,()->editor.getDocument().replaceString(selectionStart,selectionEnd,replacedText));

    }

    protected String toCamelCase(String text) {
        char[] chars=text.toCharArray();
        StringBuilder builder=new StringBuilder().append(toUpper(chars[0]));
        int len=chars.length;
        for(int i=1;i<len;i++) {
            char ch=chars[i];
            if(ch=='_') {
                i++;
                while (i<len && chars[i++]=='_');
                builder.append(toUpper(chars[--i]));
            }
            else builder.append(toLower(ch));
        }
        return builder.toString();
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
            else builder.append(toUpper(chars[i]));
        }
        return builder.toString();
    }
}
