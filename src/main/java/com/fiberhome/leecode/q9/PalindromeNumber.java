package com.fiberhome.leecode.q9;

public class PalindromeNumber {

    //字符串处理方式
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x >= 0 && x <= 9) {
            return true;
        }
        String string = String.valueOf(x);
        char[] chars = string.toCharArray();
        int length = string.length();

        boolean isOddLength = (length & 1) == 1;

        int leftIndex, rightIndex = 0;
        //根据奇偶数初始化左右指针；
        int median = (int) Math.floor(length / 2);
        if (isOddLength) {
            leftIndex = median - 1;
            rightIndex = median + 1;
        } else {
            leftIndex = median - 1;
            rightIndex = median;
        }

        boolean isPalindrome = true;
        while (leftIndex >= 0 && rightIndex <= length - 1) {
            if (chars[leftIndex] != chars[rightIndex]) {
                isPalindrome = false;
                break;
            }


            leftIndex--;
            rightIndex++;
        }
        return isPalindrome;

    }
}
