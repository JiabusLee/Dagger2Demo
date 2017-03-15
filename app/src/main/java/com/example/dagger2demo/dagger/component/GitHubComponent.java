package com.example.dagger2demo.dagger.component;

import com.example.dagger2demo.dagger.modules.GitHubModule;
import com.example.dagger2demo.dagger.scope.UserScope;
import com.example.dagger2demo.mvp.SecondActivity;

import dagger.Component;

/**
 * Created by HERO on 2017/3/15.
 */
@UserScope
@Component(dependencies = NetComponent.class,modules = GitHubModule.class)
public interface GitHubComponent {
    void inject(SecondActivity activity);
}
