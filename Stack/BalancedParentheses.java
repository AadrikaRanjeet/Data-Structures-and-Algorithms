import java.util.*;

public class BalancedParentheses {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
           
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            
            else if (ch == ')' || ch == '}' || ch == ']') {
                
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }

    
    public static void main(String[] args)
    {
        String test1 = "{[()]}";
        

        System.out.println(isBalanced(test1));
        
    }
}
