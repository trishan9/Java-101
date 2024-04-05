package com.trishan.oop.principles.encapsulation;

public class Access {
    public static void main(String[] args) {
        A obj = new A(10, "Trishan");
//        System.out.println(obj.num); -> can't access private directly, so we use getters and setters (Encapsulation)
        System.out.println(obj.name);
        System.out.println(obj.getNum());
    }
}
