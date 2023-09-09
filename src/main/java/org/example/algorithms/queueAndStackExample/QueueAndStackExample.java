package org.example.algorithms.queueAndStackExample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueAndStackExample {
    public static void start() {
        // Очередь (Queue)
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("Queue: " + queue);
        System.out.println("Removed from Queue: " + queue.poll());
        
        // Стек (Stack)
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack: " + stack);
        System.out.println("Popped from Stack: " + stack.pop());
    }
}