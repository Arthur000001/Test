package org.example.algorithms.searchExample;

public class SearchExample {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    public static void start() {
        int[] arr = {11, 22, 25, 34, 64, 90};
        int target = 34;
        
        System.out.println("Linear Search: " + linearSearch(arr, target));
        System.out.println("Binary Search: " + binarySearch(arr, target));
    }
}