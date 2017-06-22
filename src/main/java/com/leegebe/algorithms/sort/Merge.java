package com.leegebe.algorithms.sort;

/**
 * 归并排序
 * 归并类的排序算法 归并：将两个或两个以上的有序表组合成一个新的有序表。 内部排序中，通常采用的是 2-路归并排序。
 * 即：将两个位置相邻的记录有序子序列归并为一个记录有序的序列。归并排序是建立在归并操作上的一种有效的排序算法。
 */
public class Merge extends Template {

    public void sort(Comparable[] array) {
        show(array);
        mergeSort(array, 0, array.length - 1);
        show(array);
        System.out.println(isSorted(array));
    }


    /**
     * 归并排序中合并两个相邻的部分
     * @param array 需要合并的数组
     * @param low 低下标
     * @param mid 两部分的间隔
     * @param high 高下标
     */
    public void merge(Comparable[] array, int low, int mid, int high){
        int i = low;
        int j = mid + 1;
        int k = 0;
        Comparable[] temp = new Comparable[high - low + 1];
        while (i <= mid && j <= high){
            if(less(array[i], array[j])){
                temp[k] = array[i];
                k++;
                i++;
            }else{
                temp[k] = array[j];
                k++;
                j++;
            }
        }
        while (i <= mid){
            temp[k] = array[i];
            k++;
            i++;
        }
        while (j <= high){
            temp[k] = array[j];
            k++;
            j++;
        }
        for(int index = 0; index < temp.length; index++){
            array[index + low] = temp[index];
        }
    }


    /**
     * 归并排序
     * @param array
     * @param low
     * @param high
     */
    public void mergeSort(Comparable[] array, int low, int high){
        int mid = (low + high)/2;
        if(low < high){
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    public static void main(String[] args){
        Integer[] array = {1, 8, 5, 56, 2, 3, 4, 0, 98, 9, 6, 2, 4, 182};
        Template merge = new Merge();
        merge.sort(array);

    }
}
