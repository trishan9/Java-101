package com.trishan.college.exam_practice_questions.section_d;

import java.util.Scanner;

public class Task8 {
  public static void main(String[] args) {
    System.out.print("Enter your email address: ");
    Scanner sc = new Scanner(System.in);
    String emailAddress = sc.nextLine().trim();

    try {
      if (emailAddress.contains("@") && emailAddress.contains(".") && !emailAddress.contains(" ")) {
        System.out.println("Valid String!");
      } else {
        throw new InvalidEmailException("Invalid Email Address");
      }
    } catch (InvalidEmailException e) {
      System.out.println(e);
    } finally {
      sc.close();
    }
  }
}

class InvalidEmailException extends Exception {
  InvalidEmailException(String errorMessage) {
    super(errorMessage);
  }

  InvalidEmailException() {
    super("Invalid Email Address!");
  }
}
