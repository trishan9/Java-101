package com.trishan.college.exam_practice_questions.section_d;

import java.util.Scanner;

public class Task9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = new int[5];
    try {
      System.out.print("Enter five integer values: ");
      nums[0] = sc.nextInt();
      nums[1] = sc.nextInt();
      nums[2] = sc.nextInt();
      nums[3] = sc.nextInt();
      nums[4] = sc.nextInt();

      System.out.println("Maximum value: " + max(nums));
      System.out.println("Index of the highest element: " + indexOfHighest(nums));
    } catch (ArrayIndexOutOfBoundsException e) {

    } finally {
      sc.close();
    }
  }

  static int max(int[] list) {
    int greatest = list[0];
    for (int i = 1; i < list.length; i++) {
      if (list[i] > greatest) {
        greatest = list[i];
      }
    }
    return greatest;
  }

  static int indexOfHighest(int[] list) {
    int index = 0;
    for (int i = 1; i < list.length; i++) {
      if (list[i] > list[index]) {
        index = i;
      }
    }
    return index;
  }
}
