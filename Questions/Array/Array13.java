package HackerEarth;

import java.util.HashMap;

/* 2 Sum Problem  */

public class Array13 {

    // Brute force approach :

    public static Boolean F1(int[] a, int k) {
        int n = a.length;
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                sum = a[i] + a[j];
                if (sum == k) {
                    return true;
                }
            }
        }
        return false;
    }

    // Better Approach : Using Hashing T.C -- >0(N * log N) and S.C --> 0(N)

    public static Boolean F2(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int compliment;
        for (int i = 0; i < arr.length; i++) {
            compliment = k - arr[i];
            if (map.containsKey(compliment)) {
                return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }

    // Optimal Approach : 2 Pointer Approach (Greedy Approach)

    public static Boolean F3(int[] arr, int k) {
        int n = arr.length;
        int left = 0; // Start pointer (index)
        int right = n - 1; // End pointer (index)

        while (left < right) {
            int sum = arr[left] + arr[right]; // Sum of elements at left and right pointers

            if (sum == k) {
                return true; // Found the pair
            } else if (sum < k) {
                left++; // Move left pointer to the right to increase sum
            } else {
                right--; // Move right pointer to the left to decrease sum
            }
        }
        return false; // No pair found
    }

}
