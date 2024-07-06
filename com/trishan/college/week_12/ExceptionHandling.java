package com.trishan.college.week_12;

public class ExceptionHandling {
  public static void main(String[] args) {
    System.out.println("Program start");
    int num1 = 10;
    try {
      int num2 = 10 / 0; // ArithmeticException here
    } catch (ArithmeticException e) {
      System.out.println("inside catch block");
      System.out.println(e.getMessage());
    } finally {
      System.out.println("I run if any one of try/catch is executed");
    }
    // catch & finally are optional but either both should be present after try

    int[] numA = new int[5];
    numA[0] = 100;

    try {
      numA[100] = 1000;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Index out of bound!");
    } finally {
      System.out.println("Finally Block");
    }

    String data = null;
    try {
      System.out.println(data.length());
    } catch (NullPointerException e) {
      System.out.println("Null value");
    }

    // Multilayered Exception
    try {
      int numMulti = 1000 / 0;
      String d2 = null;
      System.out.println(d2.length());
    } catch (ArithmeticException e) {
      System.out.println("Number error");
    } catch (NullPointerException e) {
      System.out.println("Null ayo");
    } finally {
      System.out.println("finally");
    }

    // Exception
    try {
      int num3 = 10 / 0;
      int[] numArr2 = new int[100];
      numArr2[10000] = 10;
    } catch (Exception e) {
      System.out.println("I catch all exception");
    }

    // throwExample();

    System.out.println("Program end");
  }

  static void throwExample() {
    throw new ArithmeticException("Where is the number?");
  }

  static void checkTry() throws Exception {
    System.out.println("When running this function wrap around try catch");
  }
}
