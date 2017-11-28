package com.leegebe.thread.threadgroup;

/**
 * Description: 自定义的ThreadGroup<br>
 *
 * @author 李恩全
 * @date 2017/11/28 上午11:48
 */
public class ThreadGroupSelfDefine {

    public static void main(String[] args){
        ThreadGroup threadGroup = new ThreadGroup(Thread.currentThread().getThreadGroup().getParent(), "thread-group-self-define");
        Thread thread = new Thread(threadGroup, "thread-one");
        ThreadGroupCommon.printThreadGroupInfo(thread);
    }

}
