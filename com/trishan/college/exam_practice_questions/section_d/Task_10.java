package com.trishan.college.exam_practice_questions.section_d;

import java.util.Scanner;

public class Task_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String sentence = sc.nextLine().trim();
    System.out.println("Vowels Count: " + countVowels(sentence));
    System.out.println("Consonants Count: " + countConsonants(sentence));

    sc.close();
  }

  static int countVowels(String string) {
    int vowels = 0;

    for (char ch : string.toLowerCase().toCharArray()) {
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowels++;
      }
    }

    return vowels;
  }

  static int countConsonants(String string) {
    int consonants = 0;

    for (char ch : string.toLowerCase().toCharArray()) {
      if (ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' || ch != 'u') {
        consonants++;
      }
    }

    return consonants;
  }
}
