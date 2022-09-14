package com.revature;

import java.util.Arrays;

public class ArrayProductChecker {

    public boolean canPartition(int[] arr) {

        // Product of all elements in the arr
        int product = 1;
        for (int n : arr) product *= n;

        // Iterating through each element.
        for (int n : arr) {
            // If element is equal to product without element return true
            if (product / n / n == 1) return true;
        }

        return false;
    }
}
