package org.example.algorithms.fibonacci;

public class RecursiveFibonacci {
    static int count = 1;
    public static int fibonacci(int n) {
        if (n <= 1) {
            System.out.print(n + " | ");
            count++;
            return n;
        } else {
            System.out.print(n + ", ");
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void start(int num) {
        int result = fibonacci(num);
        System.out.println("Fibonacci of " + num + " is " + result);
    }
}
