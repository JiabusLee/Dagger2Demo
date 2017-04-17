package com.example.dagger2demo.dagger.component;

import com.example.dagger2demo.QualifierActivity;
import com.example.dagger2demo.dagger.modules.ColorModule;

import dagger.Component;

/**
 * Created by HERO on 2017/4/17.
 */
@Component(modules = ColorModule.class)
public interface QualifierComponent {
    void inject(QualifierActivity qualifierActivity);

}
