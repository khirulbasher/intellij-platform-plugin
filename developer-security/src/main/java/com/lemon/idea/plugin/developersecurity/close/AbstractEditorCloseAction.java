package com.lemon.idea.plugin.developersecurity.close;

import com.intellij.ide.RecentProjectsManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;
import org.jetbrains.annotations.NotNull;

public class AbstractEditorCloseAction implements StartupActivity {
    @Override
    public void runActivity(@NotNull Project project) {
        RecentProjectsManager recentProjectsManager=RecentProjectsManager.getInstance();
        recentProjectsManager.getGroups().forEach(pg->{
            pg.getProjects().forEach(recentProjectsManager::removePath);
        });
    }
}
