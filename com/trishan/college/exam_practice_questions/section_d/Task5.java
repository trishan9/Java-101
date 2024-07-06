package com.trishan.college.exam_practice_questions.section_d;

public class Task5 {
  public static void main(String[] args) {
    Switch s = new Switch("Offline", false);
    Router r = new Router("Online", true);
    Hub h = new Hub("Under Maintenance", false);

    System.out.println(s.getStatus());
    System.out.println(s.isAvailable());

    System.out.println(r.getStatus());
    System.out.println(r.isAvailable());

    System.out.println(h.getStatus());
    System.out.println(h.isAvailable());
  }
}

interface NetworkDevice {
  String getStatus();

  boolean isAvailable();
}

class Switch implements NetworkDevice {
  String status;
  boolean availability;

  Switch(String status, boolean availability) {
    this.status = status;
    this.availability = availability;
  }

  @Override
  public String getStatus() {
    return this.status;
  }

  @Override
  public boolean isAvailable() {
    return this.availability;
  }
}

class Router implements NetworkDevice {
  String status;
  boolean availability;

  Router(String status, boolean availability) {
    this.status = status;
    this.availability = availability;
  }

  @Override
  public String getStatus() {
    return this.status;
  }

  @Override
  public boolean isAvailable() {
    return this.availability;
  }
}

class Hub implements NetworkDevice {
  String status;
  boolean availability;

  Hub(String status, boolean availability) {
    this.status = status;
    this.availability = availability;
  }

  @Override
  public String getStatus() {
    return this.status;
  }

  @Override
  public boolean isAvailable() {
    return this.availability;
  }
}
