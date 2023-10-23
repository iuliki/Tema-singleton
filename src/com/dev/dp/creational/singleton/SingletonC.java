package com.dev.dp.creational.singleton;

public class SingletonC implements Cloneable{

    public static SingletonC instance= new SingletonC();

    private SingletonC() {
        System.out.println("creating instance.....");
    }
    //how to fix violation
//    public Object clone() throws CloneNotSupportedException {
//        if(instance != null) {
//            throw new CloneNotSupportedException("Can't create instance. Please use getInsance() to create it.");
//        }
//        return super.clone();
//    }

    public static SingletonC getInstance() {
        return instance;
    }


    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}