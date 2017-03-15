package com.example.dagger2demo.dagger.modules;

import com.example.dagger2demo.dagger.scope.UserScope;
import com.example.dagger2demo.model.Repository;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by HERO on 2017/3/15.
 */


@Module
public class GitHubModule {

    @Provides
    @UserScope
    public GitHubApiInterface provideGitHubApiInterface(Retrofit retrofit) {
        return retrofit.create(GitHubApiInterface.class);

    }

    public interface GitHubApiInterface {
        @GET("/users/{orgName}/repos")
        Call<ArrayList<Repository>> getRepository(@Path("orgName") String orgName);
    }


}
