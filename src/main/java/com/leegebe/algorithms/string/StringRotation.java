package com.leegebe.algorithms.string;

/**
 * 字符串旋转
 * 给定一个字符串，要求把字符串前面的若干个字符移动到字符串的尾部，
 * 如把字符串“abcdef”前面的2个字符'a'和'b'移动到字符串的尾部，使得原字符串变成字符串“cdefab”。
 * 请写一个函数完成此功能，要求对长度为n的字符串操作的时间复杂度为 O(n)，空间复杂度为 O(1)。
 *
 */
public class StringRotation {

    /**
     * 旋转字符串
     * 思路： XY -> YX
     *       (XT YT)T -> YX
     *       T代表转置
     * @param str
     */
    public static void rotateString(String str, int length){
        System.out.println(str);
        char[] chars = str.toCharArray();
        rotateString(chars, 0, length - 1);
        rotateString(chars, length, str.length() - 1);
        rotateString(chars, 0 ,str.length() - 1);
        System.out.println(new String(chars));
    }


    /**
     * 旋转字符串
     * @param str
     * @param startIndex
     * @param endIndex
     */
    public static void rotateString(char[] str, int startIndex, int endIndex){
        char temp;
        while(startIndex < endIndex){
            temp = str[startIndex];
            str[startIndex] = str[endIndex];
            str[endIndex] = temp;
            startIndex ++;
            endIndex --;
        }
    }

    public static void main(String[] args){
        String str = "123456";
        int length = 2;
        rotateString(str, length);
    }
}
