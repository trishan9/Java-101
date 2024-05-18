package com.trishan.college.week_05;

public class Lecture {
    public void multiply(){
        System.out.println(2 * 2);
    }

    static int multiply(int a, int b){
        return a * b;
    }

    public static String vendingMachine(int menu){
        return switch (menu) {
            case 1 -> "Coke";
            case 2 -> "Water";
            case 3 -> "Frooti";
            default -> "Invalid Menu";
        };
    }

    public static void main(String[] args) {
        Lecture a = new Lecture();
        a.multiply();

        System.out.println(multiply(2, 3));

        String iget = vendingMachine(1);
        System.out.println("I get "+ iget);

        System.out.println(checkEligible("trishan", 300));

        System.out.println(makeSquare(4));
    }

    // Task 1
    static String checkEligible (String name, int age){
        if(age < 0 || age > 200){
            return "Hello " + name + ", Invalid age";
        } else if (age < 18) {
            return "Sorry " + name + ", You are not eligible";
        } else {
            return "Congratulations " + name + ", You are eligible";
        }
    }

    // Task 2
    static double makeSquare (double n){
        return Math.pow(n, 2);
    }
}