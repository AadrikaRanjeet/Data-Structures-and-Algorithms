package HackerEarth;

import java.util.HashSet;
import java.util.Set;

/*Union of two arrays

Given two arrays arr1[] and arr2[], the task is to find the number of elements in the union between these two arrays.
The Union of the two arrays can be defined as the set containing distinct elements from both arrays. If there are repetitions,
then only one element occurrence should be there in the union. 

*/



public class Array7 {
    public static int F(int []a1,int[] a2)
    {
        Set<Integer> set=new HashSet<>();

        for(int a:a1)
        {
            set.add(a);
        }
        for(int a:a2)
        {
            set.add(a);
        }
       return set.size();
    }
}
