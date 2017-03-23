package com.leegebe.concurrency;

/**
 * Thread测试类
 */
public class TestThread {

    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(){
          public void run(){
              System.out.println("Hello from new thread");
          }
        };
        myThread.start();
        Thread.yield();
        System.out.println("Hello from main thread");
        myThread.join();
    }
}
