package com.leegebe.design.pattern.singleton;

/**
 * 内部类实现单例模式
 */
public class SingletonInnerClass {

    private static class Singleton{
        private static SingletonInnerClass singleton = new SingletonInnerClass();
    }

    private SingletonInnerClass(){

    }

    public static SingletonInnerClass getInstance(){
        return Singleton.singleton;
    }

}
