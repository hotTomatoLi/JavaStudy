package com.leegebe.basic;

/**
 * 嵌套接口
 */
public class NestedInterface {

    interface Inner{
        void handler();
    }

    public void registerCallback(Inner inner){
        inner.handler();
    }


    public static void main(String[] args){
        NestedInterface nestedInterface = new NestedInterface();
        nestedInterface.registerCallback(new Inner() {
            public void handler() {
                System.out.println("");
            }
        });
    }
}
