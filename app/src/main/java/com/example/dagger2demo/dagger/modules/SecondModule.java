package com.example.dagger2demo.dagger.modules;

import com.example.dagger2demo.model.Student;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by HERO on 2017/3/14.
 */

@Module
public class SecondModule {

    @Provides
    @Named("secondModule")
    public String getStudentInfo(Student student) {
        return student.toString()+"secondModule";
    }

}
