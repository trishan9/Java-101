package com.trishan.strings.leetcode;

// Link: https://leetcode.com/problems/reverse-words-in-a-string/

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("       Hello       this is me   Trishan        Wagle"));
    }
    public static String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            swap(arr, start, end);
            start++;
            end--;
        }

        return String.join(" ", arr);
    }

    public static void swap(String[] arr, int a, int b) {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
