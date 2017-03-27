package com.leegebe.io.character;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 测试IO
 */
public class TestBufferedReader {

    @Test
    public void testBufferedReader() throws IOException {
        FileReader fileReader = new FileReader("E:\\2.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String result = bufferedReader.readLine();
        System.out.println(result);
    }

}
