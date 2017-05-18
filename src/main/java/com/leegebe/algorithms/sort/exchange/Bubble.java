package com.leegebe.algorithms.sort.exchange;

import com.leegebe.algorithms.sort.Template;

/**
 * 排序->交换排序->冒泡
 */
public class Bubble extends Template{

    public void sort(Comparable[] array) {
        for(int i = 0; i < array.length; i++){
            int exchangetTime = 0;
            for(int j = 0; j < array.length - i - 1; j++){
                if(less(array[j+1],array[j])){
                    exch(array, j+1, j);
                    exchangetTime ++;
                }
            }
            if(exchangetTime == 0){
                break;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] array = {1, 8, 5, 56, 2, 3, 4, 0, 98, 9, 6, 2, 4, 182};
        Template sort = new Bubble();
        sort.sort(array);
        System.out.println(sort.isSorted(array));
        sort.show(array);
    }

}
