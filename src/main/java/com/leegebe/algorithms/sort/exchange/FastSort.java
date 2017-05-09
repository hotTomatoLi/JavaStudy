package com.leegebe.algorithms.sort.exchange;

import com.leegebe.algorithms.sort.Template;

/**
 * 快速排序
 * 快速排序的思路：
 * 在数据集之中，选择一个元素作为"基准"（pivot）。
 * 所有小于"基准"的元素，都移到"基准"的左边；所有大于"基准"的元素，都移到"基准"的右边。
 * 对"基准"左边和右边的两个子集，不断重复第一步和第二步，直到所有子集只剩下一个元素为止。
 */
public class FastSort extends Template{

    public void sort(Comparable[] array) {
        int low = 0;
        int high = array.length - 1;
        sort(low,high,array);
    }

    private void sort(int startIndex, int highIndex, Comparable[] array){
        if(startIndex >= highIndex){
            return;
        }
        int low = startIndex;
        int high = highIndex;
        Comparable priot = array[low];
        while(low < high){
            while(less(priot, array[high]) && low < high){
                high --;
            }
            if(low < high){
                array[low] = array[high];
                low ++;
            }
            while (less(array[low], priot) && low < high){
                low ++;
            }
            if(low < high){
                array[high] = array[low];
                high --;
            }
        }
        array[low] = priot;
        sort(startIndex,low - 1,array);
        sort(low + 1, highIndex, array);
    }

    public static void main(String[] args) {
        Integer[] array = {1, 8, 5, 56, 2, 3, 4, 0, 98, 9, 6, 2, 4, 182};
        Template sort = new FastSort();
        sort.sort(array);
        System.out.println(sort.isSorted(array));
        sort.show(array);
    }

}
