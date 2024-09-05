/*Find the Second Largest and Second Smallest */

import java.util.*;

public class Array12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int slargest = secondLargest(a, n);
        int sSmallest = secondSmallest(a, n);
    }

    public static int secondLargest(int[] a, int n) {
        int largest = a[0];
        int slargest = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] > largest) {
                slargest = largest;
                largest = a[i];
            } else if (a[i] < largest && a[i] > slargest) {
                slargest = a[i];
            }
        }
        return slargest;

    }

    public static int secondSmallest(int[] a, int n) {
        int smallest = a[0];
        int Ssmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] < smallest) {
                Ssmallest = smallest;
                smallest = a[i];
            } else if (a[i] != smallest && a[i] < Ssmallest) {
                Ssmallest = a[i];
            }
        }
        return Ssmallest;
    }
}
