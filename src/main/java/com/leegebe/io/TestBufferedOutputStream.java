package com.leegebe.io;

import org.junit.Test;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 测试BufferedOutputStream
 */
public class TestBufferedOutputStream {


    @Test
    public void testBufferedOutputStrean() throws IOException {
        File file = new File("E:\\2.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        bufferedOutputStream.write(46);
        bufferedOutputStream.write(47);
        bufferedOutputStream.write(48);
        bufferedOutputStream.write(49);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

}
