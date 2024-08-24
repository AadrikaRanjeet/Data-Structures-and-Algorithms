import java.util.*;
public class ReverseanArray {
    public static void Solution(int []arr,int start,int end)
    {
        
        if(start>=end)
        {
            return;
        }
        Swap(arr,start,end);
        Solution(arr,start+1,end-1);
    }
    public static void Swap(int []arr,int l , int r)
    {
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
       
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       Solution(arr, 0, n-1);
       System.out.println(Arrays.toString(arr));

    }
}
