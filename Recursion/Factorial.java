package Recursion;
// import java.util.*;

public class Factorial {
    public static int Function(int n)
    {
        
        if(n==0)
        {
            return 1;
        }
        return n*Function(n-1);    
    }
    // public static void main(String []args)
    // {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     System.out.println(Function(n));
    // }
}
