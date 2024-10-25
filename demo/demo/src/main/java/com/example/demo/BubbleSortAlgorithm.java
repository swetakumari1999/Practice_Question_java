package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm {
    public static int[] bubbleSortAlgorithm(int[] numbers) {


        for (int i = 0; i < numbers.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < numbers.length; j++) {

                // Checking elements
                int temp = 0;
                if (numbers[j] < numbers[i]) {

                    // Swapping
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

}
