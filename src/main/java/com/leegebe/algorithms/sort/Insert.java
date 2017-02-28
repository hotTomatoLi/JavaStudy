package com.leegebe.algorithms.sort;

/**
 * 插入排序
 */
public class Insert extends Template {

    void sort(Comparable[] array) {
        for(int i = 1; i < array.length; i++){
            for(int j = i-1; j >= 0 ; j--){
                if(less(array[j+1],array[j])){
                   exch(array,j+1,j);
                }else{
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 0, 98, 9, 6, 2, 4, 182};
        Template insert = new Insert();
        insert.sort(array);
        insert.show(array);
    }
}
