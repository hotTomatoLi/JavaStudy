package com.leegebe.basic;

import java.util.HashMap;

/**
 * HashMap研究
 */
public class HashMapStudy {

//    public static void main(String[] args){
//        Integer i = 10;
//        System.out.println(hash(i) );
//    }

    static final int hash(Object key) {
        int h;
        int h1 = key.hashCode();
        int h2 = h1 >>> 16;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= (1 << 30)) ? (1 << 30) : n + 1;
    }

    public static void main(String[] args){
        int cap = 7;
        System.out.println(tableSizeFor(cap));
    }

}
