class Solution
{
    public static void f(int []arr)
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]>max)
           {
            max=arr[i];
           }
        }
        System.out.println(max);
    }
    
}