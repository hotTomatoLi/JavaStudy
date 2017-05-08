package com.leegebe.algorithms.sort;

/**
 * 插入排序
 * 插入排序主要思想
 * 对第n个元素，假设前面n-1个元素已经有序，从第n-1个元素开始比较，如果该元素小于n-1的元素，互换，继续向前比较；否则此次比较结束。
 * 最坏情况，数组本身为倒叙，则最后一个元素，需要比较n-1次，交换n-1次；第二个元素比较1次，交换1次，时间复杂度为O(n2)
 */
public class Insert extends Template {

    public void sort(Comparable[] array) {
        for(int i = 1; i < array.length; i++){
            for(int j = i; j > 0 && less(array[j], array[j - 1]) ; j--){
                exch(array, j, j-1);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] array = {1, 8, 5, 56, 2, 3, 4, 0, 98, 9, 6, 2, 4, 182};
        Template insert = new Insert();
        insert.sort(array);
        System.out.println(insert.isSorted(array));
        insert.show(array);
    }
}
