package com.example.dagger2demo.dagger.component;

import android.content.SharedPreferences;

import com.example.dagger2demo.dagger.modules.AppModule;
import com.example.dagger2demo.dagger.modules.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by HERO on 2017/3/15.
 */

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {

    Retrofit getRetrofit();

    OkHttpClient getOkHttpClient();

    SharedPreferences getSharedPreferences();

}
