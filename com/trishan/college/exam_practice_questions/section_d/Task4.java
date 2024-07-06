package com.trishan.college.exam_practice_questions.section_d;

public class Task4 {
  public static void main(String[] args) {
    DepositTransaction d1 = new DepositTransaction(4000, 6000);
    WithdrawalTransaction d2 = new WithdrawalTransaction(3000, 1000);
    TransferTransaction d3 = new TransferTransaction(10000, 2000);

    System.out.println(d1.getAmount());
    System.out.println(d1.isValid());

    System.out.println(d2.getAmount());
    System.out.println(d2.isValid());

    System.out.println(d3.getAmount());
    System.out.println(d3.isValid());
  }
}

interface Transaction {
  double getAmount();

  boolean isValid();
}

class DepositTransaction implements Transaction {
  double amount;
  double limit;

  DepositTransaction(double amount, double limit) {
    this.amount = amount;
    this.limit = limit;
  }

  @Override
  public double getAmount() {
    return this.amount;
  }

  @Override
  public boolean isValid() {
    return this.amount <= limit;
  }
}

class WithdrawalTransaction implements Transaction {
  double amount;
  double limit;

  WithdrawalTransaction(double amount, double limit) {
    this.amount = amount;
    this.limit = limit;
  }

  @Override
  public double getAmount() {
    return this.amount;
  }

  @Override
  public boolean isValid() {
    return this.amount <= limit;
  }
}

class TransferTransaction implements Transaction {
  double amount;
  double limit;

  TransferTransaction(double amount, double limit) {
    this.amount = amount;
    this.limit = limit;
  }

  @Override
  public double getAmount() {
    return this.amount;
  }

  @Override
  public boolean isValid() {
    return this.amount <= limit;
  }
}
