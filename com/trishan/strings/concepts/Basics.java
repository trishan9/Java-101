package com.trishan.strings.concepts;

import java.util.ArrayList;
import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {
        String name = "Trishan"; // points to object "Trishan" created in string pool inside heap.
        String name2 = "Trishan"; // points to same object that 'name' is pointing in string pool.
        String name3 = new String("Trishan"); // points to newly created string object in heap.

        System.out.println(name + " " + name2 + " " + name3);
        System.out.println(name == name2); // true as both strings points to same string object in string pool.
        System.out.println(name2 == name3); // false as name3 points to new string object which is outside string pool.
        System.out.println(name2.equals(name3)); // true as 'equals' only check value not pointer.

        // Formatted Strings (Pretty Printing)
        System.out.printf("My name is %s, I am %d years old, I have %.2f money and fav letter is %c.%n", "Trishan", 17, 999.99112, 'S');

        // String Concatenation
        // Note:
        // 1. If there's one string in expression, output will be of string,
        // 2. If there's 1 string in expression, then all the objects will call their respective toString() method and
        // convert itself to string datatype.
        // Operator Overloading like Python, C++ is not supported in Java,
        // but provides for '+' for concatenation, but we can't modify.

        System.out.println('a' + 3); // 100
        System.out.println("a" + 3); // a3 (int will be converted to Integer and will call it's toString)
        System.out.println("a" + new ArrayList<>()); // a[] (arraylist will call it's toString)
//        System.out.println(3 + new ArrayList<>()); // Error (at least one operand in exp. should be string)
        System.out.println(3 + "" + new ArrayList<>()); // Works (note) -> 3[]

        // StringBuilder and it's need:
        // Using this gives us Time and Space Complexity of O(n2) as new object is being created in memory everytime
        // and performing garbage collection. So, it's solution is StringBuilder
        String str = "";
        for (int i = 'a'; i <= 'z'; i++) {
           char ch = (char)i;
           str += ch;
        }
        System.out.println(str);

        // Using StringBuilder - object is only created once in memory. Time & Space Complexity:  O(n)
        StringBuilder strb = new StringBuilder();
        for (int i = 'a'; i <= 'z'; i++) {
            char ch = (char)i;
            strb.append(ch);
        }
        System.out.println(strb.toString());

        // String Methods
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(18, 20));
        System.out.println(str.indexOf("ab"));
        System.out.println(str.lastIndexOf("ab"));
        System.out.println(str.charAt(0));
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(Arrays.toString(str.split("")));
        System.out.println(Arrays.toString(str.split("")));
        System.out.println(str.replace("ab", "ba"));
        System.out.println("    Trishan         Wagle        ".trim());
        System.out.println("    Trishan         Wagle       ".strip());
        System.out.println("    Trishan         Wagle       ".trim().replaceAll("\\s+", " "));
        String[] arr = {"Hello", "World"};
        System.out.println(String.join(" ", arr));

        // String Comparison (Alphabetically)
        // -> 0 = Equal, -ve = 'a' is less than 'b', +ve = 'a' is greater than 'b'
        System.out.println("Apple".compareTo("Banana"));
        System.out.println("Apple".compareToIgnoreCase("apple"));
    }
}
