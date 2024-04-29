package com.trishan.arrays.leetcode;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        int length = height.length;

        int[] leftMax = new int[length];
        leftMax[0] = height[0];
        for (int i = 1; i < length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        int[] rightMax = new int[length];
        rightMax[length - 1] = height[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        for (int i = 0; i < length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]) - height[i];
            if (waterLevel < 0) {
                waterLevel = 0;
            }
            trappedWater += waterLevel;
        }

        return trappedWater;
    }
}
