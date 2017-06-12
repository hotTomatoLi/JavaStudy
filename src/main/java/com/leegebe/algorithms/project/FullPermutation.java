package com.leegebe.algorithms.project;

/**
 * 全排列
 * 思路：
 * abcd
 * 第一个元素分别为a/b/c/d时，递归后三个元素；
 * 递归终止条件，数组下标start=end
 */
public class FullPermutation {


    public static void recursivePermutation(String str){
        char[] array = str.toCharArray();
        recursivePermutation(array, 0, array.length - 1);
    }

    /**
     *
     * @param array
     * @param start
     * @param end
     */
    public static void recursivePermutation(char[] array, int start, int end){

        if(start == end){
            for(int i = 0; i <= end; i++){
                System.out.print(array[i]);
            }
            System.out.println();
        }else{
            for(int j = start; j <= end; j++){
                swap(array, j, start);
                recursivePermutation(array, start+1, end);
                swap(array, j, start);
            }
        }

    }

    public static void swap(char[] array, int left, int right){
        char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static void main(String[] args){
        FullPermutation.recursivePermutation("bcad");
    }


}
