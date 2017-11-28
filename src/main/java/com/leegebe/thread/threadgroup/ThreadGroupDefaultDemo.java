package com.leegebe.thread.threadgroup;

/**
 * Description: 线程组demo<br>
 *
 * @author 李恩全
 * @date 2017/11/28 上午11:18
 */
public class ThreadGroupDefaultDemo {

    public static void main(String[] args){
        printThreadGroupInfo(Thread.currentThread());
        Thread appThread = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i=0;i<5;i++) {
                    System.out.println("do loop " + i);
                }
            }
        });
        appThread.setName("appThread");
        appThread.start();
        printThreadGroupInfo(appThread);

    }


    static void printThreadGroupInfo(Thread t){
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
