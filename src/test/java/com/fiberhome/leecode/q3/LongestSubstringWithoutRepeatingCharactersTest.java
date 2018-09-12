package com.fiberhome.leecode.q3;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void test(){

        LongestSubstringWithoutRepeatingCharacters instace = new LongestSubstringWithoutRepeatingCharacters();

        System.out.println(Integer.valueOf('!'));

        int abcabcbb = instace.lengthOfLongestSubstring("abcabcbb");
        int bbbbb = instace.lengthOfLongestSubstring("bbbbb");
        int pwwkew = instace.lengthOfLongestSubstring("pwwkew");
        int case4 = instace.lengthOfLongestSubstring("aabaab!bb");
//        Assert.assertEquals(3,abcabcbb);
//        Assert.assertEquals(1,bbbbb);
//        Assert.assertEquals(3,pwwkew);
        Assert.assertEquals(3,case4);
    }
}
