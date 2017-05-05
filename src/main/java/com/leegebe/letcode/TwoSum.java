package com.leegebe.letcode;


import java.util.ArrayList;
import java.util.List;

/**
 * letCode习题1
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        return index;
    }


    public static void main(String[] args){
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int[] result = twoSum.twoSum(nums,9);
        if(result != null){
            for(int i = 0; i < result.length; i++){
                System.out.print(result[i]);
                System.out.print(" ");
            }
        }
    }

}
