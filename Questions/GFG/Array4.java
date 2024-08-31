package HackerEarth;
/*Alternate positive and negative numbers
Given an unsorted array arr containing both positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
Note: Array should start with a positive number and 0 (zero) should be considered a positive element. */

import java.util.ArrayList;
import java.util.List;

public class Array4 
{
      void rearrange(ArrayList<Integer> arr) {
         List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        // Separate the positive and negative numbers
        for (int num : arr) {
            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }

        int posIndex = 0, negIndex = 0, i = 0;
        int n = arr.size();

        // Clear the original list to refill it with reordered elements
        arr.clear();

        // Place the positive and negative elements alternatively in the ArrayList
        while (posIndex < positive.size() && negIndex < negative.size()) {
            arr.add(positive.get(posIndex++));
            arr.add(negative.get(negIndex++));
        }

        // If there are remaining positive elements
        while (posIndex < positive.size()) {
            arr.add(positive.get(posIndex++));
        }

        // If there are remaining negative elements
        while (negIndex < negative.size()) {
            arr.add(negative.get(negIndex++));
        }
    }
  
}
