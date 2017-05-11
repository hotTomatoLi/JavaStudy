package com.leegebe.design.pattern.singleton;

/**
 * 单例模式
 */
public class Singleton {

    /**
     * 单例对象
     */
    private static Singleton uniqueSingleton;

    private Singleton(){

    }

    public static synchronized Singleton getSingleton(){
        if(uniqueSingleton == null){
            uniqueSingleton = new Singleton();
        }
        return uniqueSingleton;
    }

}
