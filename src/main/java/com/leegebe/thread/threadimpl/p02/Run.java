package com.leegebe.thread.threadimpl.p02;

/**
 * 运行类
 */
public class Run {

    public static void main(String[] args){
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");
        a.start();
        b.start();
        c.start();

    }

}
