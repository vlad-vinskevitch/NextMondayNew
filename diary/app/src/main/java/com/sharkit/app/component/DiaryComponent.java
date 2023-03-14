package com.sharkit.app.component;

import com.sharkit.app.DiaryActivity;
import com.sharkit.app.SomeClass;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = DiaryModule.class)
public interface DiaryComponent {

    SomeClass getInstance();

}
