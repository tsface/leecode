package com.fiberhome.leecode.q4;

import org.junit.Assert;
import org.junit.Test;

public class MedianofTwoSortedArraysTest {

    @Test
    public void testFindMedianSortedArrays() {
        MedianofTwoSortedArrays instance = new MedianofTwoSortedArrays();
        int[] a1 = {1, 3};
        int[] a2 = {2};
//        double r1 = instance.findMedianSortedArrays(a1, a2);

//        System.out.println(r1);
//        Assert.assertEquals(2.0d, r1, 0.0);

//        int[] b1 = {1, 2};
//        int[] b2 = {3, 4};
//        double r2 = instance.findMedianSortedArrays(b1, b2);
//        System.out.println(r2);
//        Assert.assertEquals(2.5d, r2, 0.0);



        int[] c1 = {1, 1};
        int[] c2 = {1, 2};
        double r3 = instance.findMedianSortedArrays(c1, c2);
        System.out.println(r3);
        Assert.assertEquals(1.0d, r3, 0.0);

    }
}
