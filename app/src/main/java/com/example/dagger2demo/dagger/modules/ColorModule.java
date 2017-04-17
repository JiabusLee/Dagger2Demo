package com.example.dagger2demo.dagger.modules;

import com.example.dagger2demo.dagger.scope.BlueColor;
import com.example.dagger2demo.dagger.scope.RedColor;
import com.example.dagger2demo.model.Color;

import dagger.Module;
import dagger.Provides;

/**
 *
 * Created by HERO on 2017/4/17.
 */
@Module
public class ColorModule {

    @Provides
    @RedColor
    public Color provideRedColor() {

        return new Color(1, android.graphics.Color.parseColor("#FF0000"), "红色");

    }

    @Provides
    @BlueColor
    public Color provideBlueColor() {

        return new Color(2, android.graphics.Color.parseColor("#00FF00"), "蓝色");

    }


}
