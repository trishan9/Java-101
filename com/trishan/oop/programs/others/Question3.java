package com.trishan.oop.programs.others;

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        TaskManagerWithStack tasks = new TaskManagerWithStack(5);
        tasks.add("Learn Java");
        tasks.displayCurrentStackOfTasks();

        tasks.add("Learn Rust");
        tasks.add("Learn Kotlin");
        System.out.println(tasks.peek());
        tasks.displayCurrentStackOfTasks();

        System.out.println(tasks.complete());
        tasks.add("Learn Swift");
        tasks.displayCurrentStackOfTasks();

        tasks.displayNumberOfPendingTasks();

        tasks.add("Otherss");
        tasks.add("Otherss");
        tasks.displayCurrentStackOfTasks();

        tasks.add("New Task!");

        tasks.displayNumberOfPendingTasks();
        tasks.complete();
        tasks.displayNumberOfPendingTasks();
    }
}

class TaskManagerWithStack {
    int size;
    String[] tasks;
    int top;

    TaskManagerWithStack(int size) {
        this.size = size;
        this.tasks = new String[size];
        this.top = -1;
    }

    // Push
    void add(String task) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
        } else {
            this.top++;
            this.tasks[top] = task;
        }
    }

    // Pop
    String complete() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return "";
        } else {
            String task = this.tasks[top];
            this.tasks[top] = "completed";
            this.top--;
            return task;
        }
    }

    String peek() {
        return this.tasks[top];
    }

    boolean isFull() {
        return this.top == this.size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    public void displayCurrentStackOfTasks() {
        System.out.println(Arrays.toString(this.tasks));
    }

    public void displayNumberOfPendingTasks(){
        int count = 0;
        for(String task: this.tasks){
            if(task != "completed" && task != null){
                count++;
            }
        }
        System.out.println(count);
    }
}