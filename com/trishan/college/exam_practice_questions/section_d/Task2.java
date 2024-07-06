package com.trishan.college.exam_practice_questions.section_d;

public class Task2 {
  public static void main(String[] args) {
    BankAccount ac1 = new BankAccount("1221212x", "Trishan Wagle", 999);
    BankAccount ac2 = new BankAccount("1212123x", "Albert Maharjan", 1000);

    ac1.deposit(11);
    ac1.checkBalance();

    ac2.checkBalance();
    ac2.deposit(1000);
    ac2.checkBalance();

    ac2.withdraw(800);
    ac2.withdraw(1500);
  }
}

class BankAccount {
  final private String accountNumber;
  private String accountHolderName;
  private double balance;

  BankAccount(String accountNumber, String accountHolderName, double balance) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.balance = balance;
  }

  public void deposit(double amount) {
    this.balance += amount;
  }

  public void withdraw(double amount) {
    if (this.balance >= amount) {
      this.balance -= amount;
      System.out.println("\nSuccesfully withdrawn: Rs." + amount);
    } else {
      System.out.println("\nInsufficient Balance! Withdraw Unsuccessful");
    }
    checkBalance();
  }

  public void checkBalance() {
    System.out
        .println("Remaining Balance for " + this.accountHolderName + "(" + this.accountNumber + "): " + this.balance);
  }
}
