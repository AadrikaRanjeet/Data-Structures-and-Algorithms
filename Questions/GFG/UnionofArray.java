import java.util.*;
public class UnionofArray {
     static ArrayList<Integer> FindUnion(int []arr1,int []arr2,int m,int n)
     { 
        ArrayList<Integer> Union = new ArrayList<>();
        int i = 0; // pointers
        int j = 0;
        
        while (i < n && j < m)
        {
            // case1: arr1[i] is smaller than arr2[j]
            if (arr1[i] < arr2[j])
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
                {
                    Union.add(arr1[i]);
                }
                i++;
            }
            // case2: arr1[i] is greater than arr2[j]
            else if (arr1[i] > arr2[j])
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j])
                {
                    Union.add(arr2[j]);
                }
                j++;
            }
            // case3: arr1[i] is equal to arr2[j]
            else
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
                {
                    Union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        
        // Handle remaining elements in arr1
        while (i < n)
        {
            if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
            {
                Union.add(arr1[i]);
            }
            i++;
        }
        
        // Handle remaining elements in arr2
        while (j < m)
        {
            if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j])
            {
                Union.add(arr2[j]);
            }
            j++;
        }
        
        return Union;
    }



    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 3};
        int arr2[] = {2, 3, 4};
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> union = Solution.findUnion(arr1, arr2, n, m);
        System.out.println("Union of the two arrays: " + union);
    }
}

