package com.trishan.ds_and_algos;

class DoublyNode {
    int data;
    DoublyNode prev;
    DoublyNode next;

    DoublyNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLL {
    public static void main(String[] args) {
        DoublyLL ll = new DoublyLL();
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.display();
        ll.displayReverse();
        ll.addFirst(10);
        ll.display();
        ll.displayReverse();
    }

    DoublyNode head = null;
    DoublyNode tail = null;

    void add(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
        }
        tail = newNode;
    }

    void addFirst(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    void insertBefore(int data, DoublyNode node) {
        DoublyNode newNode = new DoublyNode(data);
        newNode.prev = node.prev;
        node.prev.next = newNode;
        newNode.next = node;
        node.prev = newNode;
    }

    void display() {
        DoublyNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println();
    }

    void displayReverse() {
        DoublyNode curr = tail;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.prev;
        }
        System.out.println();
    }
}

