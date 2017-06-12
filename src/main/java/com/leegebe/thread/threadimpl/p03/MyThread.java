package com.leegebe.thread.threadimpl.p03;

/**
 * 测试多线程不共享实例
 */
public class MyThread extends Thread {

    private static int count = 5;

    public MyThread(String threadName){
        super();
        this.setName(threadName);
    }

    public synchronized void run(){
        super.run();
        count --;
        System.out.println("由" + this.currentThread().getName() + " 计算, count=" + count);
    }

}
