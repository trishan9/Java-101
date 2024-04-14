package com.trishan.college.week8;

//class A {
//    public void print(){
//        System.out.println("A");
//    }
//}
//
//class B extends A {
//    public void print(){
//        System.out.println("B");
//    }
//}

//class A {
//    public A(){
//        System.out.println("A");
//    }
//    public void B(){
//        System.out.println("B");
//    }
//}
//
//class B extends A {
//    public void C(){
//        System.out.println("Child");
//    }
//}

//class Parent{
//    public void printMessage(){
//        System.out.println("Parent");
//    }
//}
//
//class Child extends Parent{
//    public void printMessage(){
//        System.out.println("Child");
//        super.printMessage();
//    }
//}

//class A {
//    public A(){
//        System.out.println("A");
//    }
//    public A(int x){
//        System.out.println("Hello");
//    }
//}
//
//class B extends A {
//    public B(){
//        super(1);
//        System.out.println("B");
//    }
//}
//
//class A {
//    public A(){
//        System.out.println("A");
//    }
//    public A(int x){
//        System.out.println("Hello");
//    }
//}
//
//class B extends A {
//    public B(){
//        System.out.println("B");
//        super(1);
//
//    }
//}

class A {
    public A(){
        System.out.println("A");
    }
}

class B extends A {
    int a;
    public B(){
        super();
        System.out.println(a);
    }
}

public class CheckMcqAns {
    public static void main(String[] args) {
//        A obj = new B();
//        obj.print();

//        B obj = new B();
//        System.out.print("The constructor is: ");
//        obj.C();

//        Parent obj1 = new Parent();
//        Parent obj2 = new Child();
//        obj1.printMessage();
//        obj2.printMessage();

//        B obj = new B();

        B obj = new B();
        obj.a = 1;
    }
}
