// Given a string str of lowercase alphabets and a number k, the task is to print
//  the minimum value of the string after removal of k characters. The value of a
//   string is defined as the sum of squares of the count of each distinct character 
//   present in the string. Return the minimum possible required value.





import java.util.*;
public class GamewithString 
{
    static int minValue(String str, int k) {
        // code here
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Use a max-heap (priority queue) to store frequencies
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int freq : frequencyMap.values()) {
            maxHeap.add(freq);
        }

        // Step 3: Remove k characters
        while (k > 0 && !maxHeap.isEmpty()) {
            int maxFreq = maxHeap.poll();
            maxFreq--;  // Reduce the frequency by 1
            k--;
            if (maxFreq > 0) {
                maxHeap.add(maxFreq);  // Reinsert if still positive
            }
        }

        // Step 4: Calculate the minimum value of the string
        int minValue = 0;
        while (!maxHeap.isEmpty()) {
            int freq = maxHeap.poll();
            minValue += freq * freq;  // Sum of squares of the remaining frequencies
        }

        return minValue;
    }    
}
