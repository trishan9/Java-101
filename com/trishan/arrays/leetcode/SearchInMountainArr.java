package com.trishan.arrays.leetcode;

// Link: https://leetcode.com/problems/find-in-mountain-array/description/

public class SearchInMountainArr {
    public static void main(String[] args) {
        int[] mountainArr = {7, 17, 24, 28, 30, 33, 26, 20, 12, 2};
        System.out.println(searchInMountainArray(20, mountainArr));
    }

    public static int searchInMountainArray(int target, int[] mountainArr) {
        int peakIndex = findPeakIndex(mountainArr);
        int result1 = orderAgnosticBS(mountainArr, target, 0, peakIndex, true);
        if (result1 == -1) {
            return orderAgnosticBS(mountainArr, target, peakIndex, mountainArr.length - 1, false);
        } else {
            return result1;
        }
    }

    public static int findPeakIndex(int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] > mountainArr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static int orderAgnosticBS(int[] mountainArr, int target, int start, int end, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (mountainArr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (mountainArr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
