import java.util.Scanner;

public class removeDuplicatesFromArray {
    public int removeDuplicates(int[] nums) {
         if (nums.length == 0) {
            return 0;
        }

        int j = 0; // Pointer to track the position of unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i]; // Update the position with the unique element
            }
        }

        return j + 1; // Length of the array with unique elements
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        removeDuplicatesFromArray sol = new removeDuplicatesFromArray();
        int n=sc.nextInt();//length of an array
        int []nums2=new int[n];
        for(int i=0;i<n;i++)
        {
            nums2[i]=sc.nextInt();
        }
        int length2 = sol.removeDuplicates(nums2);

        for (int i = 0; i < length2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
}
