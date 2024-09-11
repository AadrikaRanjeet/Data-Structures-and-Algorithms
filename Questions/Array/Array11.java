package HackerEarth;
/*Find the Duplicate Number
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
   There is only one repeated number in nums, return this repeated number.
   */

import java.util.HashMap;
import java.util.Map;

public class Array11 {
    

    /*IF We can use extra space */

    
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>1)
            {
                return entry.getKey();
                
            }
        }
        return -1;
    }
}
