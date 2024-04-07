package com.trishan.oop;

import static com.trishan.oop.Greet.greet;

public class Basics {
    public static void main(String[] args) {
        // Class -> named group of properties and methods. A class is a template for an object, and an object is an instance (physical existence) of a class.
        // A class creates a new data type that can be used to create objects.
        // Primitives -> Stack, Objects -> Heap

        // Class -> logical construct / no physical existence, Objects -> physical reality (occupies space in memory)

//        Student std1 = new Student(); // Dynamic Memory Allocation -> allocates memory at runtime.
//        std1.name = "Trishan Wagle";
//        std1.sid = 230352;
//        System.out.println(std1.name);
//        System.out.println(std1.sid);

        Student std1 = new Student(12345, "Trishan Wagle");
        Student std2 = new Student(345678, "Second Trishan");
        Student std3 = new Student();
        std1.printDetails();
        std2.printDetails();
        std3.printDetails();
        std3 = new Student(std2);
        std3.printDetails();
        System.out.println(std1);
        System.out.println(std1.totalStudents); // will work as first Java will check totalStudents in std1 and when it not founds it checks static variable.
        System.out.println(Student.totalStudents);
        Student.hello();

        // final keyword -> won't be able to modify again. (like constants), can be used to avoid Overriding and Inheritance as well.
        final float PI = 3.14f;

        greet();

        // Object Methods (can be overridden as well)
        // obj.hashCode() -> unique numeric representation of the object
        // obj.equals(obj2) -> object comparison
        // obj instanceOf Class
        // obj.getClass()
    }
}

class Student {
    int sid;
    String name;
    static int totalStudents;

    // Constructor - special method which is invoked automatically at the time of object creation. (initialises an object)

    // Parameterized Constructor
    Student(int sid, String name) {
        this.sid = sid;
        this.name = name;
        Student.totalStudents += 1;
    }

    // Constructor Overloading
    // Non-parameterized Constructor
    Student() {
        this.sid = 0;
        this.name = "Default User";
        Student.totalStudents += 1;

//      this(args) -> calling constructor from another constructor
    }

    // Copy Constructor
    // Shallow Copy -> changes reflects (just copies reference)
    // Deep Copy -> changes doesn't reflect (makes new array), (use loop and add one-by-one)
    Student(Student other) {
        this.sid = other.sid;
        this.name = other.name;
        Student.totalStudents += 1;
    }

    static void hello(){
        System.out.println("Hello World, Total Students: " + Student.totalStudents);
//        System.out.println(sid); // Non-static variables can't be used inside static method and Non-static methods can't be used inside static methods.
    }

    // Destructors - does it automatically
    // we can't destroy the object manually, but we can specify some actions to be performed when it is destroyed, using finalizers.
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    void printDetails() {
        System.out.printf("Name: %s\nStudent Id: %d\n", this.name, this.sid);
    }

    @Override
    public String toString(){
        return this.name + " " + this.sid;
    }
}