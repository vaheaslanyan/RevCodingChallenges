package com.revature;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DigitReorderer {

    public void reorderArr(int[] arr, String order) {

        // Iterating through array
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            List<Integer> digitsList = new ArrayList<>();

            // Saving each digit as an element in a list
            while (num > 0) {
                int digit = num % 10;
                digitsList.add(digit);
                num /= 10;
            }

            // Ordering the list according to order param
            if (order.equals("asc")) {
                Collections.sort(digitsList);
            } else if (order.equals("desc")) {
                Collections.sort(digitsList, Collections.reverseOrder());
            } else {
                System.out.println("Please pass 'asc' for ascending order or 'desc' for descending.");
                return;
            }

            // Putting list back together as a num
            for (int d : digitsList) {
                num = num * 10 + d;
            }

            // Saving sorted num back into the original array
            arr[i] = num;
        }
    }

}
