package HackerEarth;

import java.util.HashMap;

/*Find the Majority Element that occurs more than N/2 times where N is the size of the array */

public class Array15 {

    // Better Approach : Using Hashing
    public static int F(int[] nums, int N) {
        int k = N / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > k) {
                return entry.getKey();
            }
        }
        return -1;
    }

    // Optimal Approach :- More's Voting Algorithm
    // public static int F2(int[] nums, int N)
    // {

    // }

}
