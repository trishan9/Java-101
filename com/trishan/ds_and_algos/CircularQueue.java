package com.trishan.ds_and_algos;

import java.util.Arrays;

public class CircularQueue {
  int[] queue;
  int front = -1;
  int rear = -1;
  int size;

  CircularQueue(int size) {
    this.size = size;
    queue = new int[size];
  }

  void enqueue(int el) {
    if (this.isFull()) {
      System.out.println("Queue is full! Can't add " + el + " to the queue");
      return;
    }
    if (front == -1) {
      front = 0;
    }
    rear = (rear + 1) % size;
    queue[rear] = el;
    System.out.println("Enqueued: " + el);
  }

  int dequeue() {
    if (this.isEmpty()) {
      System.out.println("Queue is empty!");
      return -1;
    }
    int el = queue[front];

    if (front == rear) {
      front = rear - 1;
    } else {
      front = (front + 1) % size;
    }

    return el;
  }

  int peek() {
    if (this.isEmpty()) {
      System.out.println("Queue is empty!");
      return -1;
    }
    return queue[front];
  }

  boolean isFull() {
    return (rear + 1) % size == front;
  }

  boolean isEmpty() {
    return front == -1 && rear == -1;
  }

  void print() {
    System.out.println(Arrays.toString(queue));
  }
}
