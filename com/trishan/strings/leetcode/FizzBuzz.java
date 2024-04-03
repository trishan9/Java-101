package com.trishan.strings.leetcode;

import java.util.ArrayList;

// Link: https://leetcode.com/problems/fizz-buzz/

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

    public static ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> arr = new ArrayList<String>();
        for(int i = 1; i<=n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                arr.add("FizzBuzz");
            } else if (i % 3 == 0){
                arr.add("Fizz");
            } else if (i % 5 == 0){
                arr.add("Buzz");
            } else {
                arr.add(i + "");
            }
        }
        return arr;
    }
}
