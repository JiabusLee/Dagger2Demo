package com.example.dagger2demo.dagger.component;

import com.example.dagger2demo.MainActivity;
import com.example.dagger2demo.dagger.modules.MainModule;

import dagger.Component;

/**
 * Created by HERO on 2017/3/14.
 */

@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
