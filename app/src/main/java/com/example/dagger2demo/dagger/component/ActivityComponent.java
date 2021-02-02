package com.example.dagger2demo.dagger.component;

import com.example.dagger2demo.ConstructorInjectActivity;
import com.example.dagger2demo.dagger.modules.EmptyModule;
import com.example.dagger2demo.dagger.modules.StudentModule;

import dagger.Component;

/**
 * Created by HERO on 2017/4/13.
 */

@Component(modules = {StudentModule.class, EmptyModule.class})
//@Component
public interface ActivityComponent {
    void inject(ConstructorInjectActivity activity);
}
