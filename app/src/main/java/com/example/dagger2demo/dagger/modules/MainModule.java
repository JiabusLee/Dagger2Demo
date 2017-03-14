package com.example.dagger2demo.dagger.modules;

import com.example.dagger2demo.model.Student;

import dagger.Module;
import dagger.Provides;

/**
 * Created by HERO on 2017/3/14.
 */

@Module
public class MainModule {

    @Provides
    public Student getStudent() {
        Student student = new Student();
        student.setName("atlas");
        student.setAge(1000);
        return student;
    }

    @Provides
    public String getString() {
        return"多少六朝兴废事，尽入渔樵闲话";
    }
}
