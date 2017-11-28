package com.leegebe.thread.threadgroup;

/**
 * Description: 可打断的ThreadGroup <br>
 *
 * @author 李恩全
 * @date 2017/11/28 下午2:40
 */
public class ThreadGroupInterrupt {

    public static void main(String[] args){
        MyThread mt = new MyThread();
        mt.setName("A");
        mt.start();
        mt = new MyThread();
        mt.setName("B");
        mt.start();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){

        }
        Thread.currentThread().getThreadGroup().interrupt();
    }
}

class MyThread extends Thread{
    public void run(){
        synchronized ("A"){
            System.out.println(getName() + " about to wait.");
            try {
                "A".wait();
            }catch (InterruptedException e){
                System.out.println(getName() + " interrupted.");
            }
            System.out.println(getName() + " terminating.");
        }
    }
}
