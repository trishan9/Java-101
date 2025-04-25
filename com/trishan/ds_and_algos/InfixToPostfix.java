package com.trishan.ds_and_algos;// -(3-(-(4+5)))

import java.util.Stack;

public class InfixToPostfix {
  int precedence(char ch) {
    if (ch == '+' || ch == '-') {
      return 1;
    } else if (ch == '*' || ch == '/') {
      return 2;
    } else if (ch == '^') {
      return 3;
    }
    return -1;
  }

  String convertInfixToPostfix(String exp) {
    String res = "";
    Stack<Character> stk = new Stack<>();

    for (int i = 0; i < exp.length(); i++) {
      char ch = exp.charAt(i);
      if (precedence(ch) > 0) {
        while (!stk.isEmpty() && precedence(stk.peek()) >= precedence(ch)) {
          res += stk.pop();
        }
        stk.push(ch);
      } else {
        if (ch == '(') {
          stk.push(ch);
        } else if (ch == ')') {
          while (stk.peek() != '(') {
            res += stk.pop();
          }
          stk.pop();
        } else {
          res += ch;
        }
      }
    }
    return res;
  }

  int evaluatePostfix(String tokens) {
    Stack<Integer> resStack = new Stack<>();

    for (String token : tokens.split("")) {
      if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
        int firstPopped = resStack.pop();
        int secondPopped = resStack.isEmpty() ? 0 : resStack.pop();

        if (token.equals("+"))
          resStack.push(secondPopped + firstPopped);
        else if (token.equals("-"))
          resStack.push(secondPopped - firstPopped);
        else if (token.equals("*"))
          resStack.push(secondPopped * firstPopped);
        else if (token.equals("/"))
          resStack.push(secondPopped / firstPopped);

      } else {
        resStack.push(Integer.parseInt(token.trim()));
      }
    }

    return resStack.peek();
  }

  public static void main(String[] args) {
    System.out.println("Hello Stack!");
  }
}
