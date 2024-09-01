package HackerEarth;
/*Kadane's Algorithm
according to this algorithm we have 2 sum 1st sum intialized to 0 and next one maxSum is initalized to a[0] and then we traverse through the
array and add each element in sum if sum <0 then update sum to 0 and also check if maxSum is < sum then update maxSum to sum.the answer we will 
get is the max sum of the continous subarray

 * Given an integer array arr[]. Find the contiguous sub-array(containing at least one number) that has the maximum sum and return its sum.
 */




public class Array5 {
    public static void F(int []a)
    {
        int n=a.length;
        int sum=0,maxSum=a[0];
        for(int num:a)
        {
            sum+=num;
            if(sum<0)
            {
                sum=0;
            }
            if(maxSum<sum)
            {
                maxSum=sum;
            }
        }
        System.out.println(maxSum);
    }
}
