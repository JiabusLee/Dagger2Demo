package com.example.dagger2demo.dagger.modules;


import com.example.dagger2demo.bind.IAppManager;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class EmptyModule {

    @Binds
    abstract IAppManager bindAppManager(IAppManager appManager);

}
