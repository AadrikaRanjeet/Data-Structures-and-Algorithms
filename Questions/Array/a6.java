
/*Sort Colors (Dutch National Flag Problem) */

import java.util.*;

class a6 {
    public void sortColors(int[] color) {
        int low = 0, current = 0, high = color.length - 1;

        while (current <= high) {
            if (color[current] == 0) {
                swap(color, low, current);
                low++;
                current++;
            } else if (color[current] == 1) {
                current++;
            } else {
                swap(color, current, high);
                high--;
            }
        }
    }

    void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
