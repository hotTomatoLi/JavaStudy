package com.leegebe.design.pattern.singleton;

/**
 * volatile修饰单例模式
 */
public class SingletonVolatile {

    private static volatile SingletonVolatile instance = null;

    private SingletonVolatile(){

    }

    public static SingletonVolatile getInstance(){
        if(instance == null){
            synchronized (SingletonVolatile.class){
                if(instance == null){
                    instance = new SingletonVolatile();
                }
            }
        }
        return instance;
    }

}
