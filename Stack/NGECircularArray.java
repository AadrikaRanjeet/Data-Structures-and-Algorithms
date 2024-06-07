import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i % n]) {
                stack.pop();
            }
            if (i < n) {
                if (!stack.isEmpty()) {
                    nge[i] = stack.peek();
                } else {
                    nge[i] = -1;
                }
            }
            stack.push(nums[i % n]);
        }
        return nge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        int[] result = s.nextGreaterElements(nums);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
