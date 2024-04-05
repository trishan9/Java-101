package com.trishan.oop;

public class Static {
    static class Human {
        String name;
        int age;

        Human(String name, int age){
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Human human1 = new Human("Trishan", 17);
        Human human2 = new Human("Test", 20);

        System.out.println(human1.name + " " + human2.name);
    }
}
