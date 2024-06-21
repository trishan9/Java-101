package com.trishan.college.week_08;

public class Task1 {
  // You are building a banking application that has a BankAccount class.
  // Implement the BankAccount class with
  // encapsulation principles in mind. Include private instance variables for the
  // account number, account holder name,
  // and account balance. Provide public methods to allow clients to deposit and
  // withdraw funds, as well as access
  // the account balance. Ensure that the account balance cannot be accessed or
  // modified directly.
  public static void main(String[] args) {
    BankAccount acc1 = new BankAccount("111222A", "Trishan Wagle", 11199.99);
    System.out.println(acc1.checkBalance());
    acc1.depositFunds(110);
    System.out.println(acc1.checkBalance());
    acc1.withdrawFunds(10000);
    System.out.println(acc1.checkBalance());
    acc1.withdrawFunds(10000);

    System.out.println(acc1.getAccountNumber());
    System.out.println(acc1.getAccountHolderName());
  }
}

class BankAccount {
  private String accountNumber;
  private String accountHolderName;
  private double accountBalance;

  BankAccount(String accountNumber, String accountHolderName, double accountBalance) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.accountBalance = accountBalance;
  }

  public String getAccountNumber() {
    return this.accountNumber;
  }

  public String getAccountHolderName() {
    return this.accountHolderName;
  }

  public void depositFunds(double money) {
    this.accountBalance += money;
  }

  public void withdrawFunds(double money) {
    if (money <= this.accountBalance) {
      this.accountBalance -= money;
    } else {
      System.out.printf("Insufficient Balance!, Remaining Balance: %f\n", this.accountBalance);
    }
  }

  public double checkBalance() {
    return this.accountBalance;
  }
}
