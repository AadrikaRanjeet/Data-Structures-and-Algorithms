package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

//Subsequence means a contigous sequences , which follows the order
public class PrintallSubsequence {
    public static void f(int[] arr ,int i, ArrayList<Integer> current)
    {
       if(i==arr.length)
       {
         System.out.print(current);
         return;
       }
       current.add(arr[i]);
       f(arr,i+1,current);

       current.remove(current.size()-1);
       f(arr,i+1,current);
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]=sc.nextInt();
        }
        f(arr, 0,new ArrayList<>());
    }
}
