package com.trishan.college.week_12;

public class ClassTask {
  public static void main(String[] args) {
    try {
      int number1 = 10;
      int number2 = number1 - 10;
      int number3 = number1 / number2; // This will throw ArithmeticException
    } catch (ArithmeticException e) {
      System.out.println("Number Error");
    }

    try {
      String name = null; // This will throw NullPointerException
      System.out.println(name.length());
    } catch (NullPointerException e) {
      System.out.println("Null ayo!");
    }

    try {
      String[] names = new String[100];
      names[0] = "Ram";
      names[110] = "Shyam"; // This will throw ArrayIndexOutOfBoundsException
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Index Xaina!");
    } finally {
      System.out.println("Finally block executed.");
    }
  }
}
