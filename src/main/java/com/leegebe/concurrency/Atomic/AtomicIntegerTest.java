package com.leegebe.concurrency.Atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Description: java并发包研究-AtomicInteger<br>
 *
 * @author 李恩全
 * @date 2017/7/20 下午3:31
 */
public class AtomicIntegerTest {

    static AtomicInteger atomicInteger = new AtomicInteger(1);

    public static void main(String[] args){
        System.out.println(atomicInteger.getAndIncrement());
        System.out.println(atomicInteger.incrementAndGet());
        System.out.println(atomicInteger.get());
    }
}
