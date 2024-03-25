import java.util.*;
public class Hashing
{
    public static void main(String args[])
    {
       //creating hashmap
       HashMap<String,Integer> map=new HashMap<>();

       //insertion
       map.put("India",200);
       map.put("Afhganistan",100);
       map.put("Peru",50);

       System.out.println(map);

       //Search
       if(map.containsKey("China"))
       {
        System.out.println("Key is present");
       }
       else
       {
        System.out.println("Key is not present");
       }

       System.out.println(map.get("China"));//key exists
       System.out.println(map.get("Indonesia"));//key doesnt exists

       //Iteration in HashMap
       //for(int val:arr) for(type val:key)
       for(Map.Entry<String ,Integer>e :map.entrySet())
       {
             System.out.println(e.getKey());
             System.out.println(e.getValue());
       }

       //doosra tareeka iteration ka
       Set<String> keys=map.keySet();
       for(String key:keys)
       {
          System.out.println(key+" "+map.getKey());
       }


       //to remove something from the hashmap
       map.remove("China");
    }
}