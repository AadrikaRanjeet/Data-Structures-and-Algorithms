package Accenture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// In a shoe factory, left and right shoes are manufactured separately. Each shoe has an integral ID attached to it according to the design 
// and size. Today, the factory manufactured n left shoes and m right shoes.All the left and right shoes are put in separate cartons and are
// sent to Bob, who is in charge of making pairs and sending them for final packaging. A left shoe can only be paired with another right shoe 
// of the same ID, and each shoe cannot be a part of more than one pair. Note: Each carton can have more than one shoe with the same ID.Before
//  Bob starts making pairs, the manager wants to know the IDs of all pairs of shoes that will be ready in sorted order so that he can get the 
//  boxes printed for final packaging.



public class Q2 
{
    public static List<Integer> Pair(int[] leftShoes, int[] rightShoes)
    {
        HashMap<Integer,Integer>map1=new HashMap<>();
        HashMap<Integer,Integer>map2=new HashMap<>();

        for(int id:leftShoes)
        {
            map1.put(id,map1.getOrDefault(id,0)+1);
        }
        for(int id:rightShoes)
        {
            map2.put(id,map2.getOrDefault(id, 0)+1);
        }

        List<Integer> pairs=new ArrayList<>();
        for(int id:map1.keySet())
        {
           if(map2.containsKey(id))
           {
             int pairCount=Math.min(map1.get(id),map2.get(id));
             if(pairCount>0&& !pairs.contains(id))
             {
                pairs.add(pairCount);
             }
           }
        }
        Collections.sort(pairs);
        return pairs;
    }
    
}
