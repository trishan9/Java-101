package com.trishan.arrays.concepts;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        /*
        ArrayLists can be used when we don't know the size of array.
        - Similar to Slices in GO.

        Size is not required when working with Arraylist, But:
            1. Size of ArrayList is fixed internally.
            2. Like if ArrayList fills by let's say by half, then:
                a) will create new ArrayList of maybe twice or whatever the size.
                b) old elements are copied into new one.
                c) old ArrayList is deleted
            -> Time Complexity: O(1)
        */

        ArrayList<Integer> list = new ArrayList<>(5); // 5 is set as initial capacity

        for (int i = 0; i < 10; i++) {
            list.add(i);
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
        ArrayList<Integer> list2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list2.add(sc.nextInt());
        }

        // Output
        for (int i = 0; i < 5; i++) {
//            System.out.println(list2[i]); -> Can't do this
            System.out.println(list2.get(i));
        }
    }
}
