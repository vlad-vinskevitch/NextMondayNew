package com.sharkit.app;

import com.sharkit.domain.MyClass;

import javax.inject.Inject;

public class SomeClass {

    private final MyClass myClass;

    @Inject
    public SomeClass(MyClass myClass){
        this.myClass = myClass;
    }

    public void print(){
        myClass.print();
    }
}
