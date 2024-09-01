package HackerEarth;
/*find minimum sum subarray */

public class Array6 
{
   public static int F(int[] arr)
   {
     int sum=0,minSum=Integer.MAX_VALUE;
     for(int a:arr)
     {
         sum+=a;
         if(minSum>sum)
         {
            minSum=sum;
         }
         if(sum>0)
         {
            sum=0;
         }
     }
     return minSum;
   }    
}
