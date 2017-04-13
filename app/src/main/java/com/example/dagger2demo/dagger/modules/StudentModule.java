package com.example.dagger2demo.dagger.modules;

import com.example.dagger2demo.model.Student;

import dagger.Module;
import dagger.Provides;

/**
 * Created by HERO on 2017/4/13.
 */

@Module
public class StudentModule {
    @Provides
    public Student provideStudent() {
        Student student = new Student();
        student.setName("studentModule");
        student.setAge(18);
        return student;
    }
}
