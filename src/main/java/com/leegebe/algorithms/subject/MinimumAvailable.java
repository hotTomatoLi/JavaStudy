package com.leegebe.algorithms.subject;

/**
 * 最小可用数算法
 * 现代社会中，有很多服务依赖⼀种
 * 被称为ID的概念。例如⾝份证就是⼀种ID，银⾏账户也是⼀种ID，电话号码本
 * 质上也是⼀种ID。假设我们使⽤⾮负整数作为某个系统的的ID，所有⽤户都由
 * ⼀个ID唯⼀确定。任何时间，这个系统中有些ID处在使⽤中的状态，有些ID则
 * 可以⽤于分配给新⽤户。现在的问题是，怎样才能找到最⼩的可分配ID呢？例
 * 如下⾯的列表记录了当前正在被使⽤的ID：
 * [18, 4, 8, 9, 16, 1, 14, 7, 19, 3, 0, 5, 2, 11, 6]
 * 最⼩可分配的ID，也就是不在这个列表中的最⼩整数是10。
 */
public class MinimumAvailable {

    public static int[] data = {1,2};

    /**
     * 普通算法
     * 对num=1开始的数据进行循环，判断num是否在data中，
     * 如果在，num++，继续循环；
     * 不在，则返回num的值。
     * @return
     */
    public static int ordinaryAlgorithms(){
        int num = 0;
        while (true){
           boolean hasFlag = false;
           for(int i = 0; i < data.length; i++){
               if(data[i] == num){
                   hasFlag = true;
                   break;
               }
           }
           if(!hasFlag){
               break;
           }else{
               num ++;
           }
        }
        return num;
    }

    /**
     * 改进算法
     * 基于以下事实：
     * 如果[x1,x2,...,xn]n个非负整数data，如果为[0,n-1]，那么最小可用数为n；如果数组中有任意一个数大于n，那么相应的最小可用数必然小于n，即
     * result <= n
     * 这样，定义一个n+1长度的布尔值元素flag[]，默认值均为false；
     * 遍历data，如果data[i] < n，那么对应的flag[data[i]]=true
     * 最后遍历flag[]，找到第一个false的位置index，index即为所求的
     * 最后，如果data为[0,1,2,...,n-1]，那么只有flag[n]为false，最终的值也就为n
     * @return
     */
    public static int improvement_one(){
        boolean[] flag = new boolean[data.length+1];
        for(int i = 0; i < flag.length; i++){
            flag[i] = false;
        }
        for(int i = 0; i < data.length; i++){
            int dataEle = data[i];
            if(dataEle < data.length){
                flag[dataEle] = true;
            }
        }

        for(int i = 0; i < flag.length; i++){
            if(flag[i] == false){
                return i;
            }
        }
        throw new RuntimeException("没有找到数据");
    }


    public static void main(String[] args){
        System.out.println(ordinaryAlgorithms());
        System.out.println(improvement_one());
    }
}
