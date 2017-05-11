package com.leegebe.design.pattern.singleton;

/**
 * 饿汉式的单例
 */
public class SingletonHangry {

    private static SingletonHangry uniqueSingletonHangry = new SingletonHangry();

    private SingletonHangry(){

    }

    public static SingletonHangry getSingletonHangry(){
        return uniqueSingletonHangry;
    }

}
