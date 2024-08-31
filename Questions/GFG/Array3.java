package HackerEarth;

import java.util.ArrayList;

public class Array3 {
    public static void F(int []arr)
    {
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
               list.add(arr[i]);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
               list.add(arr[i]);
            }
        }
    }
}
