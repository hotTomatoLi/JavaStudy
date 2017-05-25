package com.leegebe.thread.threadimpl.p03;

/**
 * 运行类
 */
public class Run {

    public static void main(String[] args){
        MyThread t = new MyThread("T");
        Thread a = new Thread(t,"A");
        Thread b = new Thread(t,"B");
        Thread c = new Thread(t,"C");
        Thread d = new Thread(t,"D");
        Thread e = new Thread(t,"E");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

    }

}
