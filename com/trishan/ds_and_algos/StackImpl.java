package com.trishan.ds_and_algos;

import java.util.Arrays;

public class StackImpl {
  int[] stack;
  int top;
  int size;

  StackImpl(int size) {
    this.size = size;
    stack = new int[size];
    top = -1;
  }

  void push(int el) {
    if (this.isFull()) {
      System.out.println("Stack Overflow! Can't add " + el + " to the stack");
      return;
    }
    top++;
    stack[top] = el;
    System.out.println("Pushed: " + el);
    this.print();
  }

  int pop() {
    if (this.isEmpty()) {
      System.out.println("Stack Underflow!");
      return -1;
    }
    int el = stack[top];
    top--;
    this.print();
    return el;
  }

  int peek() {
    if (this.isEmpty()) {
      System.out.println("Stack is empty!");
      return -1;
    }
    return stack[top];
  }

  boolean isFull() {
    return top == size - 1;
  }

  boolean isEmpty() {
    return top == -1;
  }

  void print() {
    System.out.println(Arrays.toString(stack));
  }

  public static void main(String[] args) {
    StackImpl stack = new StackImpl(5);
    stack.pop();
    stack.push(2);
    stack.push(3);
    stack.push(6);
    System.out.println("Popped: " + stack.pop());
    System.out.println("Stack Peek: " + stack.peek());
    stack.push(20);
    stack.push(40);
    stack.push(50);
    stack.push(60);
    System.out.println("Stack Peek: " + stack.peek());
  }
}
