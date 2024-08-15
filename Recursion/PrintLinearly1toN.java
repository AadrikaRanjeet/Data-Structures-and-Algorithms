package Recursion;

public class PrintLinearly1toN {
    public static void Solution(int i, int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.println(i);
        Solution(i+1, n);
    }
    
}
