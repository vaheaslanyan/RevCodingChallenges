package com.revature;

import java.util.Arrays;

public class Launcher {

    static DigitReorderer dr = new DigitReorderer();
    static ArrayProductChecker apc = new ArrayProductChecker();

    public static void main(String[] args) {

        System.out.println("\na) Function that reorders digits =========================================================================");

        int[] arr11 = {515, 341, 98, 44, 211};
        int[] arr12 = {63251, 78221};
        int[] arr13 = {1, 2, 3, 4};

        System.out.println("\nTest case: " + Arrays.toString(arr11));
        dr.reorderArr(arr11, "asc");
        System.out.println("Asc: " + Arrays.toString(arr11));
        dr.reorderArr(arr11, "desc");
        System.out.println("Desc: " + Arrays.toString(arr11));

        System.out.println("\nTest case: " + Arrays.toString(arr12));
        dr.reorderArr(arr12, "asc");
        System.out.println("Asc: " + Arrays.toString(arr12));
        dr.reorderArr(arr12, "desc");
        System.out.println("Desc: " + Arrays.toString(arr12));

        System.out.println("\nTest case: " + Arrays.toString(arr13));
        dr.reorderArr(arr13, "asc");
        System.out.println("Asc: " + Arrays.toString(arr13));
        dr.reorderArr(arr13, "desc");
        System.out.println("Desc: " + Arrays.toString(arr13));


        System.out.println("\na) Function returns true if one element is equal to product of rest ======================================");

        int[] arr21 = {2, 8, 4, 1};
        int[] arr22 = {-1, -10, 1, -2, 20};
        int[] arr23 = {-1, -20, 5, -1, -2, 2};

        System.out.println("\nTest case: " + Arrays.toString(arr21));
        System.out.println("Result: " + apc.canPartition(arr21));

        System.out.println("\nTest case: " + Arrays.toString(arr22));
        System.out.println("Result: " + apc.canPartition(arr22));

        System.out.println("\nTest case: " + Arrays.toString(arr23));
        System.out.println("Result: " + apc.canPartition(arr23));


    }

}
