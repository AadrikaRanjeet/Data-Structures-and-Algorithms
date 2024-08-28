//Second Largest element without sorting 


public class SecondLargest 
{
   public static int F(int []arr)
   {
      int largest=arr[0];
      int secondLargest=-Integer.MIN_VALUE;
      for(int i=1;i<arr.length-1;i++)
      {
          if(arr[i]>largest)
          {
           
            secondLargest=largest;
            largest=arr[i];
          }
            else if(arr[i]>secondLargest && arr[i]!=largest)
            {
                secondLargest=arr[i];
            }
          
      }
      return secondLargest;
    }
}
