package com.dev.dp.creational.singleton;

import java.lang.reflect.Constructor;

public class SingletonR {

    public static SingletonR instance= new SingletonR();

//    private SingletonR() {
//        System.out.println("creating instance.....");
//        if(instance != null) {
//            throw new RuntimeException("Can't create instance. Please use getInsance() to create it.");
//        }
//    }
//aici este clasa care merge dar care nu creaza instanta
    private SingletonR() {
        System.out.println("creating instance.....");

    }


    public static SingletonR getInstance() {
        return instance;
    }

}