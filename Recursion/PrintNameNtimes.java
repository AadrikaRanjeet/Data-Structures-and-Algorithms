package Recursion;

public class PrintNameNtimes {
    public static void function(String name,int n)
    {
        //base case
        if(n>5)
        {
            return;
        }
        System.out.println("Aadrika");
        function("Aadrika",n++);
    }
}
