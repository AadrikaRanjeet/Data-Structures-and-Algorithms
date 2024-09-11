package HackerEarth;

/*Rearrange Array Elements by Sign 
 * You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should return the array of nums such that the the array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

 
*/
public class Array17 {
    public int[] rearrangeArray(int[] nums) {
        int posIndex = 0;
        int negIndex = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && i % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[posIndex];
                nums[posIndex] = temp;
                posIndex += 2;
            }

            if (nums[i] > 0 && i % 2 != 0) {
                int temp = nums[i];
                nums[i] = nums[negIndex];
                nums[negIndex] = temp;
                negIndex += 2;
            }
        }
        return nums;
    }
}
