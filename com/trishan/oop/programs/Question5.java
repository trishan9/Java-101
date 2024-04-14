package com.trishan.oop.programs;

public class Question5 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.calculate(3, 4));
        System.out.println(c1.calculate(3.5, 4.2));

        ScientificCalculator c2 = new ScientificCalculator();
        System.out.println(c2.calculate(2, 3));
        System.out.println(c2.calculate(2.2, 3.2));
        System.out.println(c2.calculate(2, 3, 4));
        System.out.println(c2.calculate(2.2, 3.5, 4.2));
    }
}

class Calculator {
    int calculate(int a, int b){
        return a * b;
    }

    double calculate(double a, double b){
        return a * b;
    }
}

class ScientificCalculator extends Calculator {
    @Override
    int calculate(int a, int b){
        return (int)Math.pow(a, b);
    }

    @Override
    double calculate(double a, double b){
        return Math.pow(a, b);
    }

    int calculate(int a, int b, int c){
        return a * b * c;
    }

    double calculate(double a, double b, double c){
        return a * b * c;
    }
}
