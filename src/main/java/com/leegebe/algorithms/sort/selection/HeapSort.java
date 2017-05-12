package com.leegebe.algorithms.sort.selection;

import com.leegebe.algorithms.sort.Template;

/**
 * 堆排序
 * 堆的概念
 * 堆：完全二叉树，所有的父节点都大于（或小于）子节点，称为最大堆（最小堆）
 * i=0...n-1，子节点分别是2*+1 和2*i+2，父节点时(i-1)/2向下取整
 *
 * 以最小堆为例
 * 下移节点 :下沉某个节点，即对于某个位置i，如果比其子节点大，则交换i和最小的子节点，同时i指向最小的子节点，直至没有子节点或是i已经小于其所有的子节点；
 * 上浮某个节点: 即对某个位置i，如果比其父节点要小，则需要交互i和父节点，同时i指向父节点，直至没有父节点或是i已经大于父节点；
 * 创建堆，即根据给定的数据，创建一个堆，创建堆的原理很简，即对于i=0...n-1，其最大的父节点为索引为max = (n-1-1)/2，从j=max到0，执行下沉j节点，就相当于，j的子堆满足堆的定义，然后再依次向上查找父堆进行下沉操作。
 */
public class HeapSort extends Template {
    @Override
    public void sort(Comparable[] array) {
        createHeap(array);
        int heapSizeIndex = array.length - 1;
        while (heapSizeIndex >= 0){
            exch(array,0, heapSizeIndex);
            heapSizeIndex --;
            shiftDown(0, array, heapSizeIndex);
        }
    }

    /**
     * 下移元素
     * @param i
     * @param array
     */
    public void shiftDown(int i, Comparable[] array, int heapSizeIndex){
        while( 2*i + 1 <= heapSizeIndex){//当前节点是父节点
            int leftSon = 2*i+1;
            int targetIndex = i;
            if(less(array[leftSon],array[i])){//父节点大于子节点
                targetIndex = leftSon;
            }
            if(2*i + 2 <= heapSizeIndex && less(array[2*i+2],array[targetIndex])){//当前的最小节点大于右子节点
                targetIndex = 2*i + 2;
            }
            if(targetIndex == i){//当前父节点已经小于子节点
                break;
            }else{
                exch(array,i,targetIndex);
                i = targetIndex;
            }
        }
    }

    /**
     * 上移元素
     * @param i
     * @param array
     */
    public void shiftUp(int i , Comparable[] array, int heapSizeIndex){
        if(i > heapSizeIndex){
            return;
        }
        int fatherIndex = (i-1)/2;
        while(fatherIndex >=0){
            if(less(array[i],array[fatherIndex])){//子节点小于父节点
                exch(array,i,fatherIndex);
            }
            i = fatherIndex;
        }
    }

    /**
     * 创建堆
     * @param array
     */
    public void createHeap( Comparable[] array){
        int lastFather = (array.length - 2)/2;
        for(int i = lastFather; i >=0; i--){
            shiftDown(i, array, array.length);
        }
    }


    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 0, 98, 9, 6, 2, 4, 182};
        Template selection = new HeapSort();
        selection.sort(array);
        int i = 0;
        while (i < array.length/2){
            selection.exch(array,i,array.length-1-i);
            i++;
        }
        selection.show(array);
        System.out.println(selection.isSorted(array));
    }
}
