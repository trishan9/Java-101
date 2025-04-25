package com.trishan.ds_and_algos;

class DownloadImage {
  // This Object can only be accessed by other thread after previous thread's
  // execution completes
  // synchronized void downloadImage(String name, int size) {
  // for (int i = 0; i < size; i++) {
  // System.out.println("Downloading image " + name + i + ".png");
  // }
  // }

  void downloadImage(String name, int size) {
    for (int i = 0; i < size; i++) {
      System.out.println("Downloading image " + name + i + ".png");
    }
  }
}

class MyThread extends Thread {
  DownloadImage dref;

  MyThread(DownloadImage dref) {
    this.dref = dref;
  }

  @Override
  public void run() {
    super.run();
    dref.downloadImage("dog", 10);
  }
}

class YourThread extends Thread {
  DownloadImage dref;

  YourThread(DownloadImage dref) {
    this.dref = dref;
  }

  @Override
  public void run() {
    super.run();
    dref.downloadImage("cat", 10);
  }
}

class OurThread extends Thread {
  DownloadImage dref;

  OurThread(DownloadImage dref) {
    this.dref = dref;
  }

  @Override
  public void run() {
    super.run();
    dref.downloadImage("animal", 10);
  }
}

class TheirThread extends Thread {
  DownloadImage dref;

  TheirThread(DownloadImage dref) {
    this.dref = dref;
  }

  @Override
  public void run() {
    super.run();
    dref.downloadImage("living-beings", 10);
  }
}

public class ThreadExample {
  public static void main(String[] args) {
    System.out.println("Application started");

    for (int i = 0; i < 100; i++) {
      System.out.println("Download image of single thread " + i + ".jpg");
    }

    DownloadImage dref = new DownloadImage();

    MyThread t1 = new MyThread(dref);
    YourThread t2 = new YourThread(dref);
    OurThread t3 = new OurThread(dref);
    TheirThread t4 = new TheirThread(dref);

    t1.start();
    try {
      t1.join(); // Attaching the t1 thread to main thread, to set it as high priority
      t2.join();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    t2.start();
    t3.start();
    t4.start();

    System.out.println("Application stopped");
  }
}

// public class ThreadExample extends Thread {
// @Override
// public void run() {
// super.run();
// for (int i = 0; i < 10; i++) {
// System.out.println("download image cat" + i + ".jpg");
// }
// }
//
// public static void main(String[] args) {
// System.out.println("application started");
// for (int i = 0; i < 100; i++) {
// System.out.println("download image dog" + i + ".jpg");
// }
//
// ThreadExample t1 = new ThreadExample();
// t1.start();
//
// System.out.println("application stopped");
// }
// }

// class A {
//
// }
//
// public class ThreadExample extends A implements Runnable {
// @Override
// public void run() {
// for (int i = 0; i < 10; i++) {
// System.out.println("download image cat" + i + ".jpg");
// }
// }
//
// public static void main(String[] args) {
// System.out.println("application started");
// for (int i = 0; i < 100; i++) {
// System.out.println("download image dog" + i + ".jpg");
// }
//
// ThreadExample t1 = new ThreadExample();
//
// Thread thread = new Thread(t1);
// thread.start();
//
// System.out.println("application stopped");
// }
// }
