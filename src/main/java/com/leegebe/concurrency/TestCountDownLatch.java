package com.leegebe.concurrency;

import java.util.concurrent.CountDownLatch;

/**
 * 用于测试CountDownLatch方法
 * 总共启动了NUM + 1个线程
 * 初始化NUM个线程，利用startSignal.await()阻塞这些线程
 * 主线程中执行startSignal.countDown()，则触发NUM个线程的执行，同时主线程doneSignal.await()，等待NUM个线程执行完毕
 * NUM个线程中，每个线程都会执行一次doneSignal.countDown()，当值为0时，主线程触发启动，执行完毕。
 */
public class TestCountDownLatch {

    private static final int NUM = 100;


    public static void main(String[] args) throws InterruptedException {
        CountDownLatch doneSignal = new CountDownLatch(2);
        CountDownLatch startSignal = new CountDownLatch(1);//开始执行信号

        for (int i = 1; i <= NUM; i++) {
            new Thread(new Worker( doneSignal, startSignal)).start();//线程启动了
        }
        System.out.println("begin------------");
        startSignal.countDown();//开始执行啦
        doneSignal.await();//等待所有的线程执行完毕
        System.out.println("Ok");

    }

    static class Worker implements Runnable{

        private final CountDownLatch doneSignal;
        private final CountDownLatch startSignal;

        Worker( CountDownLatch doneSignal,
               CountDownLatch startSignal) {
            this.startSignal = startSignal;
            this.doneSignal = doneSignal;
        }

        public void run() {
            try {
                startSignal.await(); //等待开始执行信号的发布
                System.out.println(Thread.currentThread());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                doneSignal.countDown();
            }
        }
    }
}
