package com.sharkit.app.component;

import com.sharkit.application.MyClassImpl;
import com.sharkit.domain.MyClass;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public abstract class DiaryModule {

    @Singleton
    @Provides
    public static MyClass provideMyClass(MyClassImpl myClass){
        return myClass;
    }

}
