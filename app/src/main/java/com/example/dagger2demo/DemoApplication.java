package com.example.dagger2demo;

import android.app.Application;

import com.example.dagger2demo.dagger.component.DaggerGitHubComponent;
import com.example.dagger2demo.dagger.component.DaggerNetComponent;
import com.example.dagger2demo.dagger.component.GitHubComponent;
import com.example.dagger2demo.dagger.component.NetComponent;
import com.example.dagger2demo.dagger.modules.AppModule;
import com.example.dagger2demo.dagger.modules.GitHubModule;
import com.example.dagger2demo.dagger.modules.NetModule;

/**
 * Created by HERO on 2017/3/14.
 */

public class DemoApplication extends Application {
    private NetComponent netComponent;
    private GitHubComponent mGitHubComponent;

    public NetComponent getNetComponent() {
        return netComponent;
    }


    public GitHubComponent getGitHubComponent() {
        return mGitHubComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();


        netComponent = DaggerNetComponent.builder().appModule(new AppModule(this))
                .netModule(new NetModule("http://api.github.com"))
                .build();

        mGitHubComponent = DaggerGitHubComponent.builder()
                .netComponent(netComponent)
                .gitHubModule(new GitHubModule())
                .build();

    }


}
