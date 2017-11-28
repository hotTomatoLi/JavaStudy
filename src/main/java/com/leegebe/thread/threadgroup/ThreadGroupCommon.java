package com.leegebe.thread.threadgroup;

/**
 * Description: <br>
 *
 * @author 李恩全
 * @date 2017/11/28 上午11:49
 */
public class ThreadGroupCommon {

    public static void printThreadGroupInfo(Thread t){
        ThreadGroup threadGroup = t.getThreadGroup();
        System.out.println("thread " + t.getName() + " group name is " + threadGroup.getName()
                + ", max priority is " + threadGroup.getMaxPriority() + ", thread count is " + threadGroup.activeCount());
        ThreadGroup parent = threadGroup;
        do{
            ThreadGroup current = parent;
            parent = parent.getParent();
            if(parent == null){
                break;
            }
            System.out.println(current.getName() + "'s parent is " + parent.getName());
        }while (true);
        System.out.println("--------------------");
    }

}
