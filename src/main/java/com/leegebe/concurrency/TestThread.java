package com.leegebe.concurrency;

/**
 * Thread测试类
 */
public class TestThread {

    public static void main(String[] args) throws InterruptedException {
//        Thread myThread = new Thread(){
//          public void run(){
//              System.out.println("Hello from new thread");
//          }
//        };
//        myThread.start();
//        Thread.yield();
//        System.out.println("Hello from main thread");
//        myThread.join();
        class Counter {
            private int count = 0;
            public void increment() { ++count; }
            public int getCount() { return count; }
        }
        final Counter counter = new Counter();
        class CountingThread extends Thread {
            public void run() {
                for(int x = 0; x < 100000; ++x)
                    counter.increment();
            }
        }
        CountingThread t1 = new CountingThread();
        CountingThread t2 = new CountingThread();
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println(counter.getCount());
    }
}
