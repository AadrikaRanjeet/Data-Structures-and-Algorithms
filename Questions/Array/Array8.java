package HackerEarth;

/*Rotate Array by One

Given an array arr, rotate the array by one position in clock-wise direction.
Examples:

Input: arr = [1, 2, 3, 4, 5]
Output: [5, 1, 2, 3, 4]
Explanation: If we rotate arr by one position in clockwise 5 come to the front and remaining those are shifted to the end.*/



public class Array8 {
    public static int[] F(int[] arr)
    {
        if (arr.length==0 ||arr.length==1)
        {
            return arr;
        }
        int lastELement =arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=lastELement;

        return arr;
    }
}
