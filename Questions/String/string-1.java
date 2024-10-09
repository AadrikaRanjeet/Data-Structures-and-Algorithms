package Strings;

/*Remove Outermost Parentheses */

public class string-1
{

    public static String Valid(String s)
    {
        StringBuilder result=new StringBuilder();
        int build=0;
        for(char c:s.toCharArray())
        {
            if(c=="(")
            {
                if(build>0)
                {
                    result.append(c);
                }
            }
            build++;
            else if(c==")")
            {
                build--;
                if(build > 0)
                {
                    result.append(c);
                }
            }
        }
        return build.toString();
    }
}
