/*
 * @(#)TwoSumTest 2017/3/5
 */
package com.fiberhome.leecode;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * @author liyan
 * @version 2017/3/5
 * @see
 * @since 1.0
 */
public class TwoSumTest {

    private int[] nums = {20,9,4,45,6,734,34};

    private TwoSum twoSum;

    @Before
    public void setUp() throws Exception {
        twoSum = new TwoSum();
    }

    @Test
    public void testTowSum(){
        int[] result = twoSum.twoSum(nums, 13);
        assertEquals(1,result[0]);
        assertEquals(2,result[1]);
    }

    @Test
    public void testQuickSort(){
        int[] ints = quickSort(nums, 0, nums.length - 1);
        assertEquals(ints[0],4);
        assertEquals(ints[1],6);
        assertEquals(ints[6],734);
    }


    public int[] quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int i = left, j = right, x = nums[left];
            while (i < j) {
                while (i < j && nums[j] >= x) j--;//从右向左找第一个小于x的数字
                //
                if (i < j) {
                    nums[i++] = nums[j];
                }
                while (i < j && nums[i] < x) i++;//从左想右找第一个大于x的数字
                if (i < j) {
                    nums[j--] = nums[i];
                }
            }
            nums[i] = x;
            quickSort(nums, left, i - 1);
            quickSort(nums, i + 1, right);
        }

        return nums;
    }

}
