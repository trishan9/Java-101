package com.trishan.college.week9;

public class Task6 {
//    Let's examine the Java program given. It involves multiple classes that depict different book types, including Book,
//    FictionBook, NonFictionBook, and TechnicalBook. The Book class features a constructor and a method
//    called displayDetails(). This method is responsible for outputting the title and author of a book.
//    The remaining classes inherit both the constructor and methods of the Book class as they extend it.
    public static void main(String[] args) {
        FictionBook fictionBook = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald");
        NonFictionBook nonFictionBook = new NonFictionBook("The Psychology of Money", "YMorgan Housel");
        TechnicalBook technicalBook = new TechnicalBook("Cracking the coding interview", "Gayle Laakmann McDowell");

        fictionBook.displayDetails();
        nonFictionBook.displayDetails();
        technicalBook.displayDetails();
    }
}

class Book {
    private String title;
    private String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println();
    }
}

class FictionBook extends Book {
    FictionBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayDetails(){
        System.out.println("This is a fiction book!");
        super.displayDetails();
    }
}

class NonFictionBook extends Book {
    NonFictionBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayDetails(){
        System.out.println("This is a non-fiction book!");
        super.displayDetails();
    }
}

class TechnicalBook extends Book {
    TechnicalBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayDetails(){
        System.out.println("This is a technical book!");
        super.displayDetails();
    }
}
