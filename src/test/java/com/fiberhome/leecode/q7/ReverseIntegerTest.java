package com.fiberhome.leecode.q7;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {

    @Test
    public void testReverse(){
        ReverseInteger instance = new ReverseInteger();
        Assert.assertEquals(123,instance.reverse(321));
        Assert.assertEquals(265987,instance.reverse(789562));
        Assert.assertEquals(74652,instance.reverse(25647));
        Assert.assertEquals(4652,instance.reverse(25640));
        Assert.assertEquals(-521,instance.reverse(-125));
        Assert.assertEquals(-621,instance.reverse(-1260));

    }
}
