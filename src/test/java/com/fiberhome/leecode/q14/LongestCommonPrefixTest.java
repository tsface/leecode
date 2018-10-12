package com.fiberhome.leecode.q14;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

    @Test
    public void test(){

        LongestCommonPrefix instance = new LongestCommonPrefix();


//        String[] s = {"flower","flow","flight"};
        String[] s = {"aca","cba"};

        String s1 = instance.longestCommonPrefix(s);

        Assert.assertEquals("",s1);

    }
}
