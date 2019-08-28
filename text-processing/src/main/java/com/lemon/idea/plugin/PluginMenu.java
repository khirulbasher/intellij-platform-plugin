package com.lemon.idea.plugin;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.components.ApplicationComponent;
import org.jetbrains.annotations.NotNull;

public class PluginMenu implements ApplicationComponent {

    @NotNull
    @Override
    public String getComponentName() {
        return "Text";
    }

    @Override
    public void initComponent() {
        Notifications.Bus.notify(new Notification("PluginMenu.initComponent","PluginMenu.initComponent","PluginMenu.initComponent", NotificationType.WARNING,null));
    }
}
