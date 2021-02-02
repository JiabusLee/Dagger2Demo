package com.example.dagger2demo.bind.impl;

import com.example.dagger2demo.bind.IAppManager;

import javax.inject.Inject;

public class AppManagerImpl implements IAppManager {

    @Inject
    public AppManagerImpl() {

    }

    @Override
    public void print(String str) {
        System.out.println(str);
    }
}
