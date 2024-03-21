import java.util.*;
public class Solution
{
   public static void main(String args[])
   {
    Solution<Integer> stack=new Solution<>();
    stack.push(1);
    stack.push(2);
    stack.pop();
    while(!stack.isEmpty())
    {
     System.out.println(stack.peek());
     stack.pop();
    }
   }
}