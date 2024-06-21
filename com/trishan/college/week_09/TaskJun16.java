package com.trishan.college.week_09;

public class TaskJun16 {
  public static void main(String[] args) {
  }
}

class Pant {
  String color;
  String texture;

  Pant(String color, String texture) {
    this.color = color;
    this.texture = texture;
  }
}

class HalfPant extends Pant {
  String color = "White";

  HalfPant() {
    super("Black", "Wool");
  }

  void design(String color) {
    super.color = this.color;
    this.color = color;
  }
}
