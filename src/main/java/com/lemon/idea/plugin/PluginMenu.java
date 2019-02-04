package com.lemon.idea.plugin;

import com.intellij.openapi.components.ApplicationComponent;
import org.jetbrains.annotations.NotNull;

public class PluginMenu implements ApplicationComponent {

    @NotNull
    @Override
    public String getComponentName() {
        return "Text";
    }

    /*public void initComponent() {
        ActionManager am = ActionManager.getInstance();
        Plugin action = new Plugin();

        am.registerAction("uppercase", action);

        DefaultActionGroup windowM = (DefaultActionGroup) am.getAction("WindowMenu");

        windowM.addSeparator();
        windowM.add(action);
    }*/
}
