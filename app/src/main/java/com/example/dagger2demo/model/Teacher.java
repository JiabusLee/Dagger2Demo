package com.example.dagger2demo.model;

import javax.inject.Inject;

/**
 * Created by HERO on 2017/4/13.
 */

public class Teacher {

    private Student student;

    @Inject
    public Teacher(Student student) {
        this.student = student;
    }

    public Teacher changeStudentName(String name) {
        student.setName(name);
        return this;
    }

    public String getStudent() {
        return student.toString();
    }

}

