package com.trishan.ds_and_algos;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class SinglyLL {
  public static void main(String[] args) {
    SinglyLL ll = new SinglyLL();
    ll.add(20);
    ll.add(30);
    ll.add(40);
    ll.add(50);
    ll.display();
    ll.addFirst(10);
    ll.display();
  }

  Node head = null;
  Node tail = null;

  void add(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      // Node curr = head;
      // while (curr.next != null) {
      // curr = curr.next;
      // }
      // curr.next = newNode;
      tail.next = newNode;
      tail = newNode;
    }
  }

  void addFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
  }

  int remove() {
    return 1;
  }

  int removeFirst() {
    return 1;
  }

  void display() {
    Node curr = head;
    while (curr != null) {
      System.out.print(curr.data + "->");
      curr = curr.next;
    }
    System.out.println();
  }
}
