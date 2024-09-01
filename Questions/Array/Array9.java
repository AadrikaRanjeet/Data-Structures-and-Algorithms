package HackerEarth;
/*Minimize the Heights
 
*Given an array arr[] denoting heights of N towers and a positive integer K.
For each tower, you must perform exactly one of the following operations exactly once.
Increase the height of the tower by K
Decrease the height of the tower by K
Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.
 */

import java.util.Arrays;

public class Array9 {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
           // Edge case: if array has only one element
        if (n == 1) return 0;

        // Sort the array
        Arrays.sort(arr);
        
        // Initialize the minimum difference as the difference between max and min height in the sorted array
        int minDiff = arr[n - 1] - arr[0];
        
        // Iterate through the array to compute the new min and max heights
        for (int i = 0; i < n - 1; i++) {
            // Calculate the potential new maximum height and minimum height
            int max = Math.max(arr[i] + k, arr[n - 1] - k);
            int min = Math.min(arr[i + 1] - k, arr[0] + k);
            
            // Update the minimum difference
            minDiff = Math.min(minDiff, max - min);
        }
        
        return minDiff;
    }
}
