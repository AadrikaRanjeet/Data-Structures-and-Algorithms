package HackerEarth;

/*Sort an Array of 0's 1's and 2's : Dutch National Flag algorithm */

public class Array14 {
    public static void F(int[] a) {
        int low = 0;
        int mid = 0;
        int high = a.length - 1;

        while (mid <= high) {
            if (a[mid] == 0) {
                swap(a[low], a[mid]);
                low++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                swap(a[mid], a[high]);
                high--;
            }
        }

    }

    public static void swap(int low, int mid) {
        int temp = low;
        low = mid;
        mid = temp;
    }
}
