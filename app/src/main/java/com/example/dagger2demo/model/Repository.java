package com.example.dagger2demo.model;

/**
 * Created by HERO on 2017/3/15.
 */

public class Repository {
    String name;
    String fullName;
    String description;

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Repository{" +
                "name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
