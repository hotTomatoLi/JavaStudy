package com.leegebe.io;

import java.io.*;

/**
 * 测试BufferedInputStream
 */
public class TestBufferedInputStream {


    public static void testReturnInt() throws IOException {
        File file = new File("E:\\1.txt");

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));

        System.out.println(bufferedInputStream.read());
    }

    public static void testArrayCopy(){
        int[] buffer = new int[6];
        int[] des = new int[6];
        for(int i = 0; i < buffer.length; i++){
            buffer[i] = i;
        }
        for(int  i= 0; i < buffer.length; i++){
            System.out.print(buffer[i] + " ");
        }
        System.out.println("");
        int markpos = 3;
        int sz = 3;
        System.arraycopy(buffer, markpos, buffer, 0 , sz);
        for(int  i= 0; i < buffer.length; i++){
            System.out.print(buffer[i] + " ");
        }

    }

    public static void main(String[] args) throws IOException {
        testArrayCopy();
    }


}
