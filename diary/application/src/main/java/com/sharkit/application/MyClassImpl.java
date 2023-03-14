package com.sharkit.application;

import com.sharkit.domain.MyClass;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MyClassImpl implements MyClass {

    @Inject
    public MyClassImpl(){
    }
    @Override
    public void print() {
        System.out.println("HELLO " + this);
    }
}