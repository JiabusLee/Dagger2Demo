package com.example.dagger2demo.dagger.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by HERO on 2017/4/17.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface RedColor {
}
