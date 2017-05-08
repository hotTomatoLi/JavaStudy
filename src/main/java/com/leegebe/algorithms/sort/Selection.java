package com.leegebe.algorithms.sort;

/**
 * 选择排序
 * 选择排序的主要思想：
 * 找到最小的元素，将它与第一个元素交换位置；
 * 然后在剩下的数组中找到最小的元素，与第二个元素交换位置；
 *
 * 总共需要交换N次，空间复杂度O(1)；时间复杂度为比较的次数，比较次数为(N-1)+(N-2)+...+1=(N-1)N/2
 */
public class Selection extends Template {

    @Override
    public void sort(Comparable[] array) {
        for(int i = 0; i < array.length; i++){
            int index = i;
            for(int j = i+1; j < array.length; j++){
                if(!less(array[index],array[j])){
                    index = j;
                }
            }
            exch(array, i, index);
        }
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 0, 98, 9, 6, 2, 4, 182};
        Template selection = new Selection();
        selection.sort(array);
        selection.show(array);
        System.out.println(selection.isSorted(array));
    }
}
