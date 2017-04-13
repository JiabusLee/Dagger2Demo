package com.example.dagger2demo.dagger.component;

import com.example.dagger2demo.MainActivity;
import com.example.dagger2demo.dagger.modules.MainModule;
import com.example.dagger2demo.dagger.modules.SecondModule;
import com.example.dagger2demo.model.Student;

import dagger.Component;

/**
 * Created by HERO on 2017/3/14.
 */

@Component(modules = {MainModule.class, SecondModule.class})
public abstract class MainComponent {
    static MainComponent sComponent = null;

    public static MainComponent getInstance() {
        if (sComponent == null) {
            sComponent = DaggerMainComponent.builder().build();
        }
        return sComponent;
    }

    public abstract void inject(MainActivity mainActivity);

    public abstract Student getStudent();


}
