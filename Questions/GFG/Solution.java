//First non-repeating character in a stream

import java.util.*;

public class Solution{
    public static String FirstNonRepeating(String s)
    {
        HashMap<Character,Integer> map=new HashMap<>();//create map for eeping track of the count of each character
        Queue<Character> queue=new LinkedList<>(); //create a queue to maintain the oreder of the characters
        StringBuilder result=new StringBuilder();//to store the result array
        
        
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
            queue.add(ch);

            while(!queue.isEmpty() && map.get(queue.peek())>1)
            {
                queue.poll();
            }
            if(queue.isEmpty())
            {
                result.append('#');
            }
            else{
                result.append(queue.peek());
            }
        }
        return result.toString();
    }
}