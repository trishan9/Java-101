package com.trishan.college.exam_practice_questions.section_d;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
  public static void main(String[] args) {
    ShoppingCart c1 = new ShoppingCart("c1", "Trishan Wagle");
    ShoppingCart c2 = new ShoppingCart("c2", "Albert Maharjan");

    Product p1 = new Product("p1", "Iphone15", 100000);
    Product p2 = new Product("p2", "MacBook", 200000);

    c1.addItem(p1);
    c1.addItem(p2);
    System.out.println("Total Cost: " + c1.calculateTotal());

    System.out.println();

    c2.addItem(p1);
    c2.addItem(p2);

    System.out.println("Total Cost: " + c2.calculateTotal());
    c2.removeItem(p2);
    System.out.println("Total Cost: " + c2.calculateTotal());
  }
}

class ShoppingCart {
  private String cartId;
  private String customerName;
  private List<Product> items;

  ShoppingCart(String cartId, String customerName) {
    this.cartId = cartId;
    this.customerName = customerName;
    this.items = new ArrayList<>();
  }

  public void addItem(Product item) {
    this.items.add(item);
    System.out.println(item.productName + " has been added to the cart!");
  }

  public void removeItem(Product item) {
    this.items.remove(item);
    System.out.println(item.productName + " has been removed from the cart!");
  }

  public double calculateTotal() {
    double total = 0;
    for (Product item : this.items) {
      total += item.price;
    }
    return total;
  }
}

class Product {
  String productId;
  String productName;
  double price;

  Product(String productId, String productName, double price) {
    this.productId = productId;
    this.productName = productName;
    this.price = price;
  }
}
