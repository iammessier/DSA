package org.Lab;

import java.util.*;

public class Main {
    int stack_size;
    int top = -1;
    char stack[];

    Main(int s) {
        stack = new char[s];
        stack_size = s;
    }

    int size() {
        return stack_size;
    }

    boolean isempty() {
        return top == -1;
    }

    void push(char data) {
        if (top == stack_size - 1) {
            return;
        }
        stack[++top] = data;
    }

    char pop() {
        if (top == -1) {
            return '\0';
        }
        return stack[top--];
    }

    char peek() {
        if (top == -1) {
            return '\0';
        }
        return stack[top];
    }

    boolean balancedBracket(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (isempty()) {
                    return false;
                }
                char topChar = pop();
                if ((ch == ')' && topChar != '(') || (ch == ']' && topChar != '[') || (ch == '}' && topChar != '{')) {
                    return false;
                }
            }
        }
        return isempty();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.next();
        Main stack = new Main(expression.length());
        if (stack.balancedBracket(expression)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
