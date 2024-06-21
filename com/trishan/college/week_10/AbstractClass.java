package com.trishan.college.week_10;

public class AbstractClass {
  public static void main(String[] args) {
    Samsung p1 = new Samsung();
    p1.sms();
    p1.call("9818919112");

    Apple p2 = new Apple();
    p2.sms();
    p2.call("9818919112");
  }
}

abstract class SmartPhone {
  abstract void sms();

  abstract public boolean call(String number);

  void imei() {
    System.out.println("Imei number");
  }
}

class Samsung extends SmartPhone {
  @Override
  void sms() {
    System.out.println("Samsung way of sending sms");
  }

  @Override
  public boolean call(String number) {
    System.out.println("Samsung calling to " + number);
    return true;
  }
}

class Apple extends SmartPhone {
  @Override
  void sms() {
    System.out.println("Apple way of sending sms");
  }

  @Override
  public boolean call(String number) {
    System.out.println("Apple calling to " + number);
    return true;
  }
}
