package com.example.dagger2demo.dagger.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by HERO on 2017/3/15.
 */

@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface MyActivityScope {
}
