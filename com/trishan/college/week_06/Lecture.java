package com.trishan.college.week_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Lecture {
  public static void main(String[] args) {
    int[] myFirstArray; // Declaration
    myFirstArray = new int[5]; // Dynamic Memory Allocation
    int[] mySecondArray = new int[3]; // Declaration, and Memory Allocation
    int[] myThirdArray = { 10, 20, 30, 40 }; // Declaration, Memory Allocation, and Initialization

    mySecondArray[0] = 10;
    mySecondArray[1] = 20;
    mySecondArray[2] = 100;

    int arrayElement = mySecondArray[0];
    System.out.println("First element " + arrayElement);
    System.out.println("Second element " + mySecondArray[1]);

    // Task
    String[] animals = { "Cat", "Dog", "Tiger", "Snake" };
    System.out.println(animals[animals.length - 1]);

    // Loop in Array
    int[] arr = new int[4];
    arr[0] = -10;
    arr[1] = 0;
    arr[2] = 10;
    arr[3] = 20;

    int arrLength = arr.length;
    for (int i = 0; i < arrLength; i++) {
      System.out.println(arr[i]);
    }
    System.out.println("Descending Loop");
    for (int i = arrLength - 1; i >= 0; i--) {
      System.out.println(arr[i]);
    }

    int i = 0;
    while (i < arr.length) {
      System.out.println(arr[i]);
      i++;
    }

    String[] names = { "John", "Doe", "Foo", "Bar" };
    String foo = "Foo";
    for (int j = 0; j < names.length; j++) {
      if (names[j].equals(foo)) {
        System.out.println(j);
      }
    }

    System.out.println(arrayFinder(names, "Bar"));

    // ArrayList
    ArrayList<Integer> list = new ArrayList<>(5); // 5 is set as initial capacity

    for (int index = 0; index < 10; index++) {
      list.add(index);
    }

    System.out.println(list); // no need to perform .toString() from Arrays as it's called internally.
    System.out.println(list.contains(50));
    list.set(0, 50);
    System.out.println(list.contains(50));
    System.out.println(list);
    list.removeFirst();
    list.removeLast();
    System.out.println(list);
    list.remove(2);
    System.out.println(list);

    // Taking Inputs
    // ArrayList<Integer> list2 = new ArrayList<>();
    // Scanner sc = new Scanner(System.in);
    //
    // for (int index = 0; index < 5; index++) {
    // list2.add(sc.nextInt());
    // }

    // // Output
    // for (int index = 0; index < 5; index++) {
    //// System.out.println(list2[i]); -> Can't do this
    // System.out.println(list2.get(index));
    // }

    // ArrayList Task
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Orange");
    fruits.add("Banana");
    fruits.add("Water Melon");
    fruits.add("Pineapple");
    System.out.println(fruits);

    fruits.add(1, "Grapes");
    System.out.println(fruits);

    fruits.remove(2);
    System.out.println(fruits);
    fruits.remove(3);
    System.out.println(fruits);

    fruits.add(0, "Pear");
    System.out.println(fruits);

    fruits.set(fruits.size() - 1, "Avocado");
    System.out.println(fruits);

    fruits.set(1, "Cherry");
    System.out.println(fruits);

    for (int index = 0; index < fruits.size(); index++) {
      System.out.println(fruits.get(index));
    }

    for (String fruit : fruits) {
      System.out.println(fruit);
    }

    // Task
    ArrayList<String> students = new ArrayList<>();
    students.add("Aruna");
    students.add("Shreeya");
    students.add("Yudip");
    students.add("Anjali");
    students.add("Nischay");
    students.add("Krishna");

    ArrayList<String> males = new ArrayList<>();
    ArrayList<String> females = new ArrayList<>();

    // for (int index = 0; index < students.size(); index++){
    // if(index == 2 || index == 4 || index == 5){
    // males.add(students.get(index));
    // } else {
    // females.add(students.get(index));
    // }
    // }

    for (String student : students) {
      if (student == "Yudip" || student == "Nischay" || student == "Krishna") {
        males.add(student);
      } else {
        females.add(student);
      }
    }

    System.out.println(males.getFirst());
    System.out.println(females.getLast());
  }

  public static int arrayFinder(String[] stringArr, String toCheck) {
    for (int i = 0; i < stringArr.length; i++) {
      if (stringArr[i].equals(toCheck)) {
        return i;
      }
    }
    return -1;
  }
}
