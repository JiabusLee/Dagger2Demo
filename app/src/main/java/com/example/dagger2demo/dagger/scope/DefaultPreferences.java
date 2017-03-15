package com.example.dagger2demo.dagger.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by HERO on 2017/3/15.
 */

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface DefaultPreferences {

}
