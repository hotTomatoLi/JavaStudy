package com.leegebe.algorithms.string;

/**
 * 字符串包含
 * 给定两个分别由字母组成的字符串A和字符串B，字符串B的长度比字符串A短。
 * 请问，如何最快地判断字符串B中所有字母是否都在字符串A里？
 */
public class StringContain {

    /**
     * 遍历的解决方案
     * @param A
     * @param B
     * @return
     */
    public static boolean containSolutionOne(String A, String B){
        char[] charsA = A.toCharArray();
        char[] charsB = B.toCharArray();
        for(int i = 0; i < charsB.length; i++){
            boolean hasFlag = false;
            for(int j = 0; j < charsA.length; j++){
                if(charsB[i] == charsA[j]){
                    hasFlag = true;
                    break;
                }
            }
            if(!hasFlag){
                return false;
            }
        }
        return  true;
    }

    public static void main(String[] args){
        String A = "ABCDEFGHINNNGGBD";
        String B = "EBCR";
        System.out.println(containSolutionOne(A, B));
        System.out.println(containSolutionTwo(A, B));

    }


    /**
     * 遍历的解决方案
     * @param A
     * @param B
     * @return
     */
    public static boolean containSolutionTwo(String A, String B){
        char[] charsA = A.toCharArray();
        char[] charsB = B.toCharArray();
        int flag = 0;
        for(int i = 0; i < charsA.length; i++){
            flag = flag | 1 << (charsA[i] - 'A');
        }
        for(int j = 0; j < charsB.length; j++){
            if((flag & (1 << charsB[j] - 'A')) == 0){
                return false;
            }
        }
        return  true;
    }


}
