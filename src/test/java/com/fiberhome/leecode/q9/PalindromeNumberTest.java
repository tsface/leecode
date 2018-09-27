package com.fiberhome.leecode.q9;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {

    @Test
    public void testIsPalindrome(){
        PalindromeNumber instance = new PalindromeNumber();

        Assert.assertEquals(true,instance.isPalindrome(121));
        Assert.assertEquals(false,instance.isPalindrome(-121));
        Assert.assertEquals(false,instance.isPalindrome(10));
    }
}
