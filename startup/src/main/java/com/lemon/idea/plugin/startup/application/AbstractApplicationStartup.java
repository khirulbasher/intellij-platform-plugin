package com.lemon.idea.plugin.startup.application;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.application.ApplicationStarter;

/**
 * Called when a project has been started
 *
 *  <pre>
 *  &lt extensions defaultExtensionNs="com.intellij" &gt <br>
 *    &lt appStarter implementation="com.lemon.idea.plugin.startup.security.StartupSecurity" /&gt <br>
 * &lt /extensions /&gt
 * </pre>
 */
public abstract class AbstractApplicationStartup implements ApplicationStarter {
    @Override
    public String getCommandName() {
        return "AbstractApplicationStartup.getCommandName";
    }

    @Override
    public void premain(String[] args) {
        Notifications.Bus.notify(new Notification("Notify in AbstractApplicationStartup.premain","Notify in AbstractApplicationStartup.premain","Notify in AbstractApplicationStartup.premain", NotificationType.INFORMATION,null));
    }

    @Override
    public void main(String[] args) {
        Notifications.Bus.notify(new Notification("Notify in AbstractApplicationStartup.main","Notify in AbstractApplicationStartup.main","Notify in AbstractApplicationStartup.main", NotificationType.INFORMATION,null));
    }
}
