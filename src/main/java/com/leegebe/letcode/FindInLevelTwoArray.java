package com.leegebe.letcode;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 思路：
 * 选取右上角的数据data，因为data所在的行其他元素都小于data，data所在的列的其他元素都大于data
 * 如果target > data，则data所在的行可以排除出选择
 * 如果target < data，则data所在的列可以排除出选择
 */
public class FindInLevelTwoArray {

    public boolean Find(int target, int [][] array) {
        int rowLow = 0;
        int rowHith = array.length - 1;
        int columnLow = 0;
        int columnHigh= array[0].length - 1;
        while (true){
            if( rowLow > rowHith || columnHigh < columnLow){
                return false;
            }
            int rightTop = array[rowLow][columnHigh];
            if(rightTop == target){
                return true;
            }else if(rightTop > target){
                columnHigh -- ;
            }else if(rightTop < target){
                rowLow ++ ;
            }
        }
    }


}
