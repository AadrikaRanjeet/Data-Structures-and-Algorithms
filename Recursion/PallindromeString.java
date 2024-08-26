package Recursion;

public class PallindromeString {
    public static Boolean Solution(String s ,int i)
    {
        if(i>=s.length()/2) 
        return true;
        if(s.charAt(i) !=s.charAt(s.length()-i-1))
        return false;
        return Solution(s, i+1);
    }
    public static void main(String []args)
    {
        String s="MADAM";
        Boolean result=Solution(s, 0);
        System.out.println(result);
    }
}
