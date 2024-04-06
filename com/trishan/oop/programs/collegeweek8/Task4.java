package com.trishan.oop.programs.collegeweek8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
//    You are developing a restaurant management system and want to create a Menu class. The Menu class should encapsulate
//    a list of MenuItem objects. Implement the Menu class with private instance variables for the menu items and
//    provide public methods to add and remove items from the menu. Ensure that the list of menu items cannot be
//    directly accessed or modified from outside the class.
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.addItem(new MenuItem("Cheeseburger", "A classic burger with cheese", 9.99));
        menu.addItem(new MenuItem("Momo", "Nice Buff Momo", 7.99));
        menu.addItem(new MenuItem("Fries", "Crispy golden fries", 3.99));

        menu.displayMenu();
        menu.removeItem(menu.getMenuItems().get(1));
        menu.displayMenu();
    }
}

class MenuItem {
    private String name;
    private String description;
    private double price;

    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}

class Menu {
    private List<MenuItem> menuItems;

    public Menu() {
        this.menuItems = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        this.menuItems.add(item);
    }

    public void removeItem(MenuItem item) {
        this.menuItems.remove(item);
    }

    public List<MenuItem> getMenuItems() {
        return new ArrayList<>(this.menuItems); // Return a copy of the list
    }

    public void displayMenu() {
        // Display all items in the menu
        System.out.println("\nMenu:");
        for (MenuItem item : this.menuItems) {
            System.out.println(item.getName() + ": Rs." + item.getPrice() + " - " + item.getDescription());
        }
    }
}
