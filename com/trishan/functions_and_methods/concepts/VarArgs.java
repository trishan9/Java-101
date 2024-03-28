package com.trishan.functions_and_methods.concepts;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        func(1, 2, 3, 4, 5);
        func2("Trishan", "Wagle", 1, 2, 3, 4, 5);
    }

    static void func(int ...args) {
        System.out.println(Arrays.toString(args));
    }
    static void func2(String fName, String lName, int ...args) {
        System.out.println(fName + " " + lName + " " + Arrays.toString(args));
    }
}
