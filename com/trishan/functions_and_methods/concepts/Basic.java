package com.trishan.functions_and_methods.concepts;

import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
        String name = "Trishan";
        greet(name);

        int num = 5;
        boolean result = isEven(num);
        System.out.println(result);

        increment(num);
        System.out.println(num); // Won't update (passing by value)

        int[] myArr = {1, 2, 3};
        updateArr(myArr, 0, 11);
        System.out.println(Arrays.toString(myArr)); // Will Update (passed reference)
    }

    static void greet(String msg){
        System.out.println("Hello " + msg);
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static void increment(int n){
        n = n + 1;
        System.out.println("Incremented: " + n);
    }

    static void updateArr(int[] array, int index, int el){
        array[index] = el;
    }
}
