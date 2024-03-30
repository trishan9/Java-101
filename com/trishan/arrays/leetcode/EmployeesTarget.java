package com.trishan.arrays.leetcode;

// Link: https://leetcode.com/problems/number-of-employees-who-met-the-target/

public class EmployeesTarget {
    public static void main(String[] args) {
        int[] hours = {0,1,2,3,4};
        int target = 2;
        System.out.println(numberOfEmployeesWhoMetTarget(hours, target));
    }

    static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        if (hours == null || hours.length == 0){
            return 0;
        }
        int count = 0;
        for (int hour: hours){
            if (hour >= target){
                count++;
            }
        }
        return count;
    }
}
