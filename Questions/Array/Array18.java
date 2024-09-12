package HackerEarth;

import java.util.ArrayList;
import java.util.List;

/*Leaders in Array 
 * Given an array arr of n positive integers, your task is to find all the leaders in the array. An element of the array is considered a leader if it is greater than all the elements on its right side or if it is equal to the maximum element on its right side. The rightmost element is always a leader.
 * 
*/

public class Array18 {

    // Brute force approach
    public static ArrayList<Integer> F(int[] a) {
        Boolean leader = true;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > a[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader == true) {
                list.add(a[i]);
            }
        }
        return list;
    }

    public static ArrayList<Integer> F2(int[] a) {
        int n = a.length;
        int max = a[n - 1];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(max);
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > max) {
                max = a[i];
                list.add(a[i]);
            }
        }
        return list;
    }
}
