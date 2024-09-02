/*Find the duplicates in array */

import java.util.ArrayList;
import java.util.HashMap;

class Solution{
  public static void F(int []arr)
  {
    HashMap<Integer,Integer> map=new HashMap<>();
    ArrayList<Integer> list=new ArrayList<>();
    
    for(int a:arr)
    {
        map.put(a,map.getOrDefault(a,0)+1);
    }
    for(Map.Entry<Integer,Integer> entry:map.entrySet())
    {
        if(entry.getValue()>1)
        {
            list.add(entry.getKey());
        }
    }
      System.out.println(list.toString());
  }
}