package com.trishan.college.exam_practice_questions.section_d;

public class Task6 {
  public static void main(String[] args) {
    TextEditor rich = new TextEditor(4);
    rich.getCurrentText();

    rich.addText("Hello");
    rich.addText("World");
    rich.undo();
    rich.addText("Albert");
    rich.addText("Maharjan");
    rich.addText("Sir");
    System.out.println(rich.getCurrentText());
    rich.addText("Dada");
  }
}

class TextEditor {
  String[] content;
  int maxLength;
  int top;

  TextEditor(int maxLength) {
    this.maxLength = maxLength;
    this.content = new String[maxLength];
    this.top = -1;
  }

  public void addText(String text) {
    if (this.isFull()) {
      System.out.println("Stack Overflow!");
    } else {
      this.top++;
      this.content[this.top] = text;
      System.out.println("Added text to the editor: " + text);
    }
  }

  public String undo() {
    if (this.isEmpty()) {
      System.out.println("Stack Underflow!");
      return "";
    } else {
      String lastText = this.content[this.top];
      this.top--;
      System.out.println("Removed text: " + lastText);
      return lastText;
    }
  }

  public boolean isFull() {
    return top == maxLength - 1;
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public String getCurrentText() {
    if (isEmpty()) {
      System.out.println("Stack is empty");
      return "";
    } else {
      return content[top];
    }
  }
}
