package com.trishan.college.week_10;

public class Task8 {
  // You are building a library management system. Design an interface named
  // "LibraryItem" with the following methods:
  // String getTitle() to retrieve the title of the library item
  // String getAuthor() to retrieve the author of the library item
  // int getYear() to retrieve the publication year of the library item
  // boolean isAvailable() to check if the library item is currently available for
  // borrowing.

  public static void main(String[] args) {

  }
}

interface ILibraryItem {
  String getTitle();

  String getAuthor();

  int getYear();

  boolean isAvailable();
}

class LibraryItem implements ILibraryItem {
  private String title;
  private String author;
  private int year;
  private boolean isAvailable;

  LibraryItem(String title, String author, int year) {
    this.title = title;
    this.author = author;
    this.year = year;
    this.isAvailable = true;
  }

  @Override
  public String getTitle() {
    return this.title;
  }

  @Override
  public String getAuthor() {
    return this.author;
  }

  @Override
  public int getYear() {
    return this.year;
  }

  @Override
  public boolean isAvailable() {
    return this.isAvailable;
  }
}
