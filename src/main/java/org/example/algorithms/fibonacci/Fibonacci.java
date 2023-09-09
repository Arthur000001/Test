package org.example.algorithms.fibonacci;

public class Fibonacci {
    public static int fibonacciRecursive(int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacciRecursive(i));
        }
    }
}