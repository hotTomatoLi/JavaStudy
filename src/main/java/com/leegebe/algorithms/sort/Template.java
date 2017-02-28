package com.leegebe.algorithms.sort;

/**
 *  排序算法的模板
 */
public abstract class Template {

    /**
     * 排序
     * @param array
     */
    abstract void sort(Comparable[] array);

    /**
     * v是否比w小
     * @param v
     * @param w
     * @return
     */
    public boolean less(Comparable v,Comparable w){
        return v.compareTo(w) < 0;
    }

    /**
     * 交换位置
     * @param array
     * @param i
     * @param j
     */
    public void exch(Comparable[] array, int i, int j){
        Comparable a = array[i];
        array[i] = array[j];
        array[j] = a;
    }

    /**
     * 打印信息
     * @param a
     */
    public void show(Comparable[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /**
     * 是否有序
     * @param array
     * @return
     */
    public boolean isSorted(Comparable[] array){
        for(int i = 1; i < array.length; i++){
            if(less(array[i],array[i-1])){
                return false;
            }
        }
        return true;
    }

}
