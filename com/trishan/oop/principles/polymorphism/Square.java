package com.trishan.oop.principles.polymorphism;

public class Square extends Shapes {
    void area(){
        System.out.println("Area is side * side");
    }

//    @Override
//    void method() { -> can't override as it is declared as final,
//        System.out.println("Overriding");
//    }
}
