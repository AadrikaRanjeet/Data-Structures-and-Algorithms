public class a2 {
    public int Remove() {
        int length = arr.length;
        int j = 0; // slow pointer
        for (int i = 1; i < length; i++) {
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return i + 1; // returning the length of the array after removing the duplicates .
    }
}
