package com.fiberhome.leecode.q11;

import org.junit.Assert;
import org.junit.Test;

public class ContainerWithMostWaterTest {

    @Test
    public void testMaxArea(){
        ContainerWithMostWater instance = new ContainerWithMostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        Assert.assertEquals(49,instance.maxArea(height));

    }
}
