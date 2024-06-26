package com.trishan.college.week_11;

public class Polymorphism {
  public static void main(String[] args) {
    MathOperation mo = new MathOperation();
    System.out.println(mo.add(10, 20));
    System.out.println(mo.add(10, 20, 50));
    mo.add();

    Document d1 = new Document();
    d1.print("Black");
    // Polymorphism allow child object to be stored in Parent Class variable
    Document d2 = new MsWord();
    d2.print("White");
    // Doing so will take the updated function and attribute from child object
    // representation
    Document d3 = new Office365();
    d3.print("Yellow");
    // When Parent variable holds child object, only the attribute and function
    // written in Parent can be used.
    // eg: d3.online; -> cannot be used
  }
}

// Method Overloading - Compiletime Polymorphism
// Making same function multiple times with diff params
class MathOperation {
  int add(int num1, int num2) {
    return num1 + num2;
  }

  // 1. Changing the num of params
  int add(int num1, int num2, int num3) {
    return num1 + num2 + num3;
  }

  // 2. Changing the datatype of params
  double add(double num1, double num2) {
    return num1 + num2;
  }

  // Note: Method Overloading expects the unique in data type of parameter
  // cannot overload method just by Changing variable
  // eg: int add(int a, int b) -> cannot do this as add with 2 int already mode
  // cannot overload by just changing return data type
  // eg: double add(int num1, int num2) -> cannot do this as add with 2 int
  // already exists
  void add() {
    System.out.println("Invalid operation");
  }
}

// Method Overriding - Runtime Polymorphism
// Making the same function of ParentClass in ChildClass
class Document {
  public void print(String paper) {
    System.out.println("Document printing...");
  }
}

// Method Overriding is only possible in ChildClass
class MsWord extends Document {
  boolean online = false;

  @Override
  public void print(String paper) {
    System.out.println("Ms Word is printing...");
  }
}

// Method Overriding can be done in multi level inheritance as well
class Office365 extends MsWord {
  boolean online = true;

  @Override
  public void print(String paper) {
    System.out.println("Online is printing...");
  }
}
