package com.example.dagger2demo.dagger.component;

import com.example.dagger2demo.ConstructorInjectActivity;

import dagger.Component;

/**
 * Created by HERO on 2017/4/13.
 */

//@Component(modules = StudentModule.class)
@Component
public interface ActivityComponent {
    void inject(ConstructorInjectActivity activity);
}
