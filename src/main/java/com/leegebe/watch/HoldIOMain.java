package com.leegebe.watch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 用于数据监控.（IO）
 */
public class HoldIOMain {

    public static void main(String[] args){
        new Thread(new HoldIOTask()).start();
        new Thread(new LazyTask()).start();
        new Thread(new LazyTask()).start();
        new Thread(new LazyTask()).start();
    }

    public static class HoldIOTask implements Runnable{

        public void run() {
            while (true){
                try{
                    FileOutputStream fileOutputStream = new FileOutputStream(new File("temp"));
                    for(int i = 0; i < 1000; i++){
                        fileOutputStream.write(i);
                    }
                    fileOutputStream.close();
                    FileInputStream fileInputStream = new FileInputStream(new File("temp"));
                    while (fileInputStream.read() != -1){
                        ;
                    }
                }catch (Exception e){

                }
            }
        }
    }

    public static class LazyTask implements Runnable{

        public void run() {
            try {
                while (true){
                    Thread.sleep(1000);
                }
            }catch (Exception e){

            }
        }
    }

}
