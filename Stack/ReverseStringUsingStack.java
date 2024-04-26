public class Solution
{
    public String Reverse(String s)
    {
        Stack<Character> stack=new Stack<>();

        //push
        if(stack.isEmpty())
        {
            for(int i=0;i<s.length();i++)
            {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder string=new StringBuilder();
        while(!stack.isEmpty())
        {
            string.append(stack.pop());
        }
        return string.toString();
    }
}