package com.dev.dp.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonS implements Serializable{

    public static SingletonS instance= new SingletonS();

    private SingletonS() {
        System.out.println("creating instance.....");
    }

    public static SingletonS getInstance() {
        return instance;
    }


}