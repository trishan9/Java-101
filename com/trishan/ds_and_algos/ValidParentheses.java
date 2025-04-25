import java.util.Stack;

public class ValidParentheses {
  boolean isValid(String str) {
    Stack<Character> stk = new Stack<>();

    for (char ch : str.toCharArray()) {
      if (ch == '(' || ch == '{' || ch == '[') {
        stk.push(ch);
      } else {
        if (ch == ')' && (stk.pop() != '(') || ch == '}' && (stk.pop() != '{') || ch == ']' && (stk.pop() != '[')) {
          return false;
        }
      }
    }
    return stk.isEmpty();
  }

  public static void main(String[] args) {
    ValidParentheses myClass = new ValidParentheses();
    System.out.println("()[]{} " + myClass.isValid("()[]{}"));
    System.out.println("{(} " + myClass.isValid("{(}"));
  }
}
