public class ValidPalindrome 
{
    class Solution {
        public boolean isPalindrome(String s) 
        {
            if(s.length()==0)
            {
                return true;
            }
            s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
            String reverseString=reverse(s);
            return s.equals(reverseString);
        }   
        public String reverse(String s)
        {
            int length=s.length();
            StringBuilder st=new StringBuilder();
            for(int i=length-1;i>=0;i--)
            {
                st.append(s.charAt(i));
            }
    
             return st.toString();
        }
    }
}
