package com.trishan.strings.leetcode;

// Link: https://leetcode.com/problems/reverse-string/description/

public class Reverse {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(s);
    }

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while(start <= end){
            swap(s, start, end);
            start++;
            end--;
        }
    }

    public static void swap(char[] arr, int a, int b){
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
