package com.trishan.college.week_06;

public class Lecture {
    public static void main(String[] args) {
        int[] myFirstArray; // Declaration
        myFirstArray = new int[5]; // Dynamic Memory Allocation
        int[] mySecondArray = new int[3]; // Declaration, and Memory Allocation
        int[] myThirdArray = {10, 20, 30, 40}; // Declaration, Memory Allocation, and Initialization

        mySecondArray[0] = 10;
        mySecondArray[1] = 20;
        mySecondArray[2] = 100;

        int arrayElement = mySecondArray[0];
        System.out.println("First element " + arrayElement);
        System.out.println("Second element " + mySecondArray[1]);

        // Task
        String[] animals = {"Cat", "Dog", "Tiger", "Snake"};
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
        while(i < arr.length){
            System.out.println(arr[i]);
            i++;
        }

        String[] names = {"John", "Doe", "Foo", "Bar"};
        String foo = "Foo";
        for (int j = 0; j < names.length; j++) {
            if(names[j].equals(foo)){
                System.out.println(j);
            }
        }

        System.out.println(arrayFinder(names, "Bar"));
    }

    public static int arrayFinder (String[] stringArr, String toCheck){
        for (int i = 0; i < stringArr.length; i++) {
            if(stringArr[i].equals(toCheck)){
                return i;
            }
        }
        return -1;
    }
}
