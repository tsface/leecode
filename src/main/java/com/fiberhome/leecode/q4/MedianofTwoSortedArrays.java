package com.fiberhome.leecode.q4;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class MedianofTwoSortedArrays {

    class MyObj {
        private int num;

        public MyObj(int num) {
            this.num = num;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (null == nums1 && null == nums2) {
            return 0d;
        }
        double median = 0.0d;


        SortedSet<MyObj> sortedSet = new TreeSet<MyObj>(new Comparator<MyObj>() {
            public int compare(MyObj o1, MyObj o2) {
                if ((o1.getNum() - o2.getNum() <= 0)) {
                    return -1;
                }
                return 1;
            }
        });


        for (int i : nums1) {
            sortedSet.add(new MyObj(i));
        }
        for (int i : nums2) {
            sortedSet.add(new MyObj(i));
        }


        Integer[] integers = new Integer[sortedSet.size()];
        Iterator<MyObj> iterator = sortedSet.iterator();
        int index1 = 0;
        while (iterator.hasNext()) {
            integers[index1] = iterator.next().getNum();
            index1++;
        }

        //判断当前数组的奇偶，如果是奇数，则直接找到中位数，如果是偶数则找到
        if ((integers.length & 1) == 1) {
            int index = (int) Math.floor(integers.length / 2);
            median = integers[index];
        } else {
            int secondIndex = (int) Math.floor(integers.length / 2);
            int firstIndex = secondIndex - 1;
            median = Double.valueOf(integers[firstIndex] + integers[secondIndex]) / 2;
        }

        return median;
    }
}
