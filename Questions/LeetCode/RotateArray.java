/*iven an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

 import java.util.Scanner;

class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return; // If the array is empty, do nothing
        k = k % n; // Normalize k

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);
        
        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);
        
        // Step 3: Reverse the remaining elements
        reverse(arr, k, n - 1);
    }
    
    private void reverse(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in the array
        
        int n = scanner.nextInt();

        // Read the elements of the array
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Read the number of steps to rotate
        
        int k = scanner.nextInt();

        // Rotate the array
        Solution sol = new Solution();
        sol.rotate(nums, k);

        // Print the rotated array
    
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
