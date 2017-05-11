package com.leegebe.letcode;

/**
 * 矩阵变形
 * 规则是：
 * 原始矩阵num[row][column]
 * 期望结果result[r][c]
 * 如果
 * row*column != r*c，则无法变形
 * 遍历所有的元素，将原始数据看做一维数组，计算相应元素在原始数据的位置，即0,1,2...(row*column-1)
 * 那么，将这一维数组放到变形后的矩阵，则根据当前索引index计算新坐标：(index/c,index%c)
 */
public class ReshapeMatrix {


    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int column = nums[0].length;
        if(row*column != r * c){
            return nums;
        }
        int[][] result = new int[r][c];
//        for(int i = 0; i < row; i++){
//            for(int j = 0; j < column; j++){
//                int rowIndex = (i*column+j)/c;
//                int columnIndex = (i*column+j)%c;
//                result[rowIndex][columnIndex] = nums[i][j];
//            }
//        }
        for(int i = 0; i < row*column ; i++){
           result[i/c][i%c] = nums[i/column][i%column];
        }
        return result;
    }

    public static void main(String[] args){
        int[][] nums = {{1,2 ,3},{4,5,6}};
        int[][] result = matrixReshape(nums, 3, 2);
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[i].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
