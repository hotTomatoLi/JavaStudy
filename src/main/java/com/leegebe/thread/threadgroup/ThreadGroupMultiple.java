package com.leegebe.thread.threadgroup;

/**
 * Description: 多层ThreadGroup<br>
 *
 * @author 李恩全
 * @date 2017/11/28 下午2:10
 */
public class ThreadGroupMultiple {

    public static void main(String[] args){
        ThreadGroup tg1 = new ThreadGroup("tg1");
        ThreadGroup tg2 = new ThreadGroup(tg1, "tg2");
        Thread t1 = new Thread(tg2, "t1");
        ThreadGroupCommon.printThreadGroupInfo(t1);
    }

}
