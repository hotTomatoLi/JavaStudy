package com.leegebe.thread.threadimpl.p01;

import com.leegebe.thread.threadimpl.p01.MyThread;

/**
 * 测试MyThread
 */
public class Run {

    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.setName("MyThread");
        myThread.start();
        try {
            for(int i = 0; i < 10; i++){
                int time = (int)(Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
