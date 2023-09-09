package org.example.algorithms.redBlackTreeExample;

import java.util.TreeMap;

public class RedBlackTreeExample {
    public static void start() {
        TreeMap<Integer, String> redBlackTree = new TreeMap<>();
        redBlackTree.put(3, "Apple");
        redBlackTree.put(1, "Banana");
        redBlackTree.put(5, "Orange");
        redBlackTree.put(2, "Grapes");
        
        System.out.println(redBlackTree);
    }
}