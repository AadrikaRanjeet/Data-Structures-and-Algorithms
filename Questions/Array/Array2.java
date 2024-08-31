package HackerEarth;

import java.util.Scanner;

public class Array2 
{
     public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt(); // Number of drivers
            int[] heights = new int[n];
            for (int i = 0; i < n; i++) {
                heights[i] = sc.nextInt();
            }
            
            int maxSight = Integer.MIN_VALUE;
            int winningDriverIndex = -1;
            
            for (int i = 0; i < n; i++) {
                int visibleDrivers = 1; // The driver can always see themselves
                
                // Check to the left
                for (int j = i - 1; j >= 0; j--) {
                    if (heights[j] < heights[i]) {
                        visibleDrivers++;
                    } else {
                        break;
                    }
                }
                
                // Check to the right
                for (int j = i + 1; j < n; j++) {
                    if (heights[j] < heights[i]) {
                        visibleDrivers++;
                    } else {
                        break;
                    }
                }
                
                int sight = visibleDrivers * (i + 1); // SIGHT = X * P
                
                // Check if this driver has the maximum SIGHT
                if (sight > maxSight || (sight == maxSight && winningDriverIndex > i + 1)) {
                    maxSight = sight;
                    winningDriverIndex = i + 1; // +1 for 1-based index
                }
            }
            
            System.out.println(winningDriverIndex);
        }
        
        sc.close();
}
}
