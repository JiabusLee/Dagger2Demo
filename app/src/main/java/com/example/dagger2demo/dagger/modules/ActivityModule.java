package com.example.dagger2demo.dagger.modules;

import android.app.Activity;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by HERO on 2017/4/13.
 */

@Module
public class ActivityModule {
    private Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    public Context provideActivityContext() {
        return activity;
    }

}
