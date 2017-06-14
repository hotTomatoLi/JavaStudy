package com.leegebe.watch;

import java.util.Random;

/**
 * 用于服务器监控代码
 */
public class HoldLockMain {

    public static Object[] lock = new Object[10];
    public static Random r = new Random();
    static {
        for(int i = 0; i < lock.length; i++){
            lock[i] = new Object();
        }
    }

    public static class HoloLockTask implements Runnable{

        private int i;

        public HoloLockTask(int i){
            this.i = i;
        }

        @Override
        public void run() {
            try{
                while (true){
                    synchronized (lock[i]){
                        if(i%2 == 0){
                            lock[i].wait(r.nextInt(10));
                        }else{
                            lock[i].notifyAll();
                        }
                    }
                }
            }catch (Exception e){

            }
        }
    }

    public static void main(String[] args){
        for(int i=0; i < lock.length*2; i++){
            new Thread(new HoloLockTask(i/2)).start();
        }
    }



}
