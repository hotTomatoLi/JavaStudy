package com.leegebe.io.nio;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 文件对象的NIO
 * https://www.ibm.com/developerworks/cn/education/java/j-nio/j-nio.html
 */
public class FileNIO {

    @Test
    public void testFileNIO() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("E:\\2.txt");
        FileChannel fileChannel = fileInputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        fileChannel.read(byteBuffer);
        System.out.println(byteBuffer.getChar(1));
    }

    @Test
    public void testFileNIOWrite() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\2.txt");
        FileChannel fileChannel = fileOutputStream.getChannel();
        String messageStr = "ceshi";
        byte[] message = messageStr.getBytes();
        ByteBuffer buffer = ByteBuffer.allocate( 1024 );

        for (int i=0; i<message.length; ++i) {
            buffer.put( message[i] );
        }
        buffer.flip();
        fileChannel.write(buffer);
    }

}
