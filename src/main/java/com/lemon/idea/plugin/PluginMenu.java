package com.lemon.idea.plugin;

import com.intellij.openapi.components.ApplicationComponent;
import org.jetbrains.annotations.NotNull;

public class PluginMenu implements ApplicationComponent {

    @NotNull
    @Override
    public String getComponentName() {
        return "Text";
    }
}
