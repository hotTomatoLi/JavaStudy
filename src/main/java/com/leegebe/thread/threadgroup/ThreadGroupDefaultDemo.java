package com.leegebe.thread.threadgroup;

/**
 * Description: 线程组demo<br>
 *
 * @author 李恩全
 * @date 2017/11/28 上午11:18
 */
public class ThreadGroupDefaultDemo {

    public static void main(String[] args){
        ThreadGroupCommon.printThreadGroupInfo(Thread.currentThread());
        Thread appThread = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i=0;i<5;i++) {
                    System.out.println("do loop " + i);
                }
            }
        });
        appThread.setName("appThread");
        appThread.start();
        ThreadGroupCommon.printThreadGroupInfo(appThread);

    }



}
