package com.trishan;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        float c = sc.nextFloat();

        float f = (c * 9/5) + 32;

        System.out.println("The temperature in Fahrenheit: " + f);
    }
}
