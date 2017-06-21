package com.leegebe.algorithms.string;

/**
 * 判断一个字符串是否是回文
 */
public class Palindrome {


    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() - 1;
        while (i < j){
            if(str.charAt(i++) != str.charAt(j --)){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        String str1 = "aba";
        String str2 = "aaaad";
        String str3 = "abccba";
        String str4 = "abcdcba";
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));
        System.out.println(isPalindrome(str4));

    }


}
