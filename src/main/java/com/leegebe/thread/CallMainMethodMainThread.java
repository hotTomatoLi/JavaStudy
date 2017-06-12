package com.leegebe.thread;

/**
 * 测试主线程的名字
 * main
 */
public class CallMainMethodMainThread {

    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());
    }

}
