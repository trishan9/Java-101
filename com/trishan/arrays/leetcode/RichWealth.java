package com.trishan.arrays.leetcode;

// Link: https://leetcode.com/problems/richest-customer-wealth/

public class RichWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account: accounts) {
            int sum = 0;
            for (int money : account) {
                sum += money;
            }
            if (sum > maxWealth){
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}
