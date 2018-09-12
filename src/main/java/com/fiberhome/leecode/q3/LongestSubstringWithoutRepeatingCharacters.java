package com.fiberhome.leecode.q3;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {

        char[] chars = s.toCharArray();
        int stringLength = chars.length;
        int maxLength = 0;

        int currentIndex = 0;

        Set<Character> allNoRepetChar = new HashSet<Character>();

        //获取待检对象
        for (; currentIndex < stringLength; ) {

//            if (currentIndex > maxLength) {
//                return maxLength;
//            }

            char currentChar = chars[currentIndex];

            int loopIndex = currentIndex + 1;
            int currentMaxLength = 1;

            char preChar = 0;
            allNoRepetChar.add(currentChar);

            //检查是否有和待检对象重复的元素
            //是否有连续重复的元素
            for (; loopIndex < stringLength; loopIndex++) {
                char loopChar = chars[loopIndex];
                if (currentChar == loopChar || preChar == loopChar || allNoRepetChar.contains(loopChar)) {
                    break;
                }
                currentMaxLength += 1;
                preChar = loopChar;
                allNoRepetChar.add(loopChar);
            }

            if (currentMaxLength > maxLength) {
                maxLength = currentMaxLength;
            }
            currentIndex++;
            allNoRepetChar.clear();
        }

        System.out.println("s : "+s+" , currentIndex = " + currentIndex + " , maxLength = " + maxLength);
        return maxLength;

    }
}
