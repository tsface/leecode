package com.fiberhome.leecode.q11;

public class ContainerWithMostWater {


    public int maxArea(int[] height) {
        int area = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int x = j - i;
                int y = Math.min(height[i], height[j]);
                area = Math.max(area, x * y);
            }
        }
        return area;
    }
}
