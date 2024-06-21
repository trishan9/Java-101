package com.trishan.oop;

public class Constructor {
  public static void main(String[] args) {
    C c = new C();
    // First it will call the constructor of A, then B, then C.
  }
}

class A {
  A() {
    System.out.println("Hello A");
  }
}

class B extends A {
  B() {
    System.out.println("Hello B");
  }
}

class C extends B {
  C() {
    System.out.println("Hello C");
  }
}
