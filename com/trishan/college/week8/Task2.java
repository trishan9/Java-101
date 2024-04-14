package com.trishan.college.week8;

public class Task2 {
//    You are developing a library management system and need to implement a Book class. The Book class should have
//    private instance variables for the book title, author name, and publication year. Implement appropriate getter and
//    setter methods to ensure encapsulation. Additionally, include a private variable to track the availability
//    of the book (e.g., true if available, false if borrowed), and provide a public method to borrow the book,
//    updating its availability status.
    public static void main(String[] args) {
        Book book1 = new Book("ABC", "Trishan", 2024);
        System.out.println(book1.getBookTitle());
        System.out.println(book1.getAuthorName());
        System.out.println(book1.getPublishedYear());
        book1.borrowBook();
        book1.borrowBook();
    }
}

class Book {
    private String bookTitle;
    private String authorName;
    private int publishedYear;
    private boolean isAvailable;

    Book(String bookTitle, String authorName, int publishedYear) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.publishedYear = publishedYear;
        this.isAvailable = true;
    }

    public void setBookTitle(String title) {
        this.bookTitle = title;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public int getPublishedYear() {
        return this.publishedYear;
    }

    public void borrowBook() {
        if (this.isAvailable) {
            System.out.println("Book has been borrowed succesfully!");
            this.isAvailable = false;
        } else {
            System.out.println("Book not available, it has already been borrowed!");
        }
    }
}