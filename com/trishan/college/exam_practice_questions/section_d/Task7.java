package com.trishan.college.exam_practice_questions.section_d;

import java.util.Scanner;

public class Task7 {
  public static void main(String[] args) {
    System.out.print("Enter a string: ");
    Scanner sc = new Scanner(System.in);
    String string = sc.nextLine().trim();

    int startRange = 5;
    int endRange = 20;

    try {
      if (string.length() > startRange && string.length() < endRange) {
        System.out.println("Valid String!");
      } else {
        throw new InvalidStringLengthException(
            "String should be between " + startRange + "-" + endRange + " characters!");
      }
    } catch (InvalidStringLengthException e) {
      System.out.println(e);
    } finally {
      sc.close();
    }
  }
}

class InvalidStringLengthException extends Exception {
  InvalidStringLengthException(String errorMessage) {
    super(errorMessage);
  }
}
