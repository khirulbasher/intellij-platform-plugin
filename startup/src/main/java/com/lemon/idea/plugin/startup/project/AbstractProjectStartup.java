package com.lemon.idea.plugin.startup.project;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a project has been started
 *
 *  <pre>
 *  &lt extensions defaultExtensionNs="com.intellij" &gt <br>
 *    &lt postStartupActivity implementation="com.lemon.idea.plugin.startup.security.StartupSecurity" /&gt <br>
 * &lt /extensions /&gt
 * </pre>
 */
public abstract class AbstractProjectStartup implements StartupActivity {
    @Override
    public void runActivity(@NotNull Project project) {
        Notifications.Bus.notify(new Notification("On Every Project Startup","On Every Project Startup","On Every Project Startup", NotificationType.INFORMATION,null));
    }
}
