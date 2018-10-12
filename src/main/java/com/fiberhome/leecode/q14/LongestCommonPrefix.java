package com.fiberhome.leecode.q14;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        String longestPrefix = "";

        List<char[]> toBeCheckedData = new ArrayList<char[]>();

        List<char[]> currentData = new ArrayList<char[]>();


        //有必要找到最短的吗？这个循环可以去掉
        int minLength = Integer.MAX_VALUE;
        for (int i = 0, len = strs.length; i < len; i++) {
            int length = strs[i].length();
            char[] chars = strs[i].toCharArray();
            if (length <= minLength) {
                minLength = length;
                currentData.add(chars);
            }
            toBeCheckedData.add(chars);
        }

        //check
        for (char[] element : currentData) {
            StringBuilder s1 = new StringBuilder();
            for (int i = 0; i < minLength; i++) {
                char c = element[i];
                boolean charEquals = true;
                for (int j = 0; j < toBeCheckedData.size(); j++) {
                    char[] chars = toBeCheckedData.get(j);
                    char aChar = chars[i];
                    if (charEquals && aChar == c) {
                        continue;
                    }
                    charEquals = false;
                    break;
                }
                if (charEquals) {
                    s1.append(c);
                }else{
                    break;
                }
            }
            if(s1.length() > longestPrefix.length()){
                longestPrefix = s1.toString();
            }
        }
        return longestPrefix;
    }
}
