package org.example.LinkedList;

import java.util.*;

class Ball {
    int strength;
    int direction;
    int index;

    Ball(int strength, int direction, int index) {
        this.strength = strength;
        this.direction = direction;
        this.index = index;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] directions = {1, -1, 1};
        int[] strengths = {5, 3, 1};
        List<Integer> result = solve(3, directions, strengths);
        System.out.println(result);  // Expected output: [0, 2]

        directions = new int[]{1, 1};
        strengths = new int[]{3, 4};
        result = solve(2, directions, strengths);
        System.out.println(result);  // Expected output: [0, 1]
    }

    public static List<Integer> solve(int n, int[] direction, int[] strength) {
        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            balls.add(new Ball(strength[i], direction[i], i));
        }

        balls.sort(Comparator.comparingInt(ball -> ball.strength));

        Stack<Ball> stack = new Stack<>();
        for (Ball ball : balls) {
            if (stack.isEmpty() || stack.peek().direction == ball.direction || stack.peek().direction < ball.direction) {
                stack.push(ball);
            } else {
                while (!stack.isEmpty() && stack.peek().direction > ball.direction && stack.peek().strength <= ball.strength) {
                    if (stack.peek().strength < ball.strength) {
                        stack.pop();
                    } else {
                        stack.pop();
                        break;
                    }
                }
                if (stack.isEmpty() || stack.peek().direction != ball.direction) {
                    stack.push(ball);
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (Ball ball : stack) {
            result.add(ball.index);
        }

        Collections.sort(result);
        return result;
    }
}
