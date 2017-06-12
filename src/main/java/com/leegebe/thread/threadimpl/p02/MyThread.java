package com.leegebe.thread.threadimpl.p02;

/**
 * 测试多线程不共享实例
 */
public class MyThread extends Thread {

    private int count = 5;

    public MyThread(String threadName){
        super();
        this.setName(threadName);
    }

    public void run(){
        super.run();
        while(count  > 0){
            count --;
            System.out.println("由" + this.currentThread().getName() + " 计算, count=" + count);
        }
    }

}
