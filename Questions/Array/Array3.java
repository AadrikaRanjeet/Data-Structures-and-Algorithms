package HackerEarth;
/*Move all negative numbers to beginning and positive to end with constant extra space */




import java.util.ArrayList;
public class Array3 {
    public static void F(int []arr)
    {
        int n=arr.length;
        int left=0,right=n-1;
        while(left<right)
        {
            if(arr[left]<0)
            {
                left++;
            }
            else if(arr[right]>0)
            {
                right++;
            }
            else
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        
    }
}
