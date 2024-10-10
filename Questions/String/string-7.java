package Strings;

/*A valid anagram refers to a situation where two strings are composed of the exact same characters, 
with the same frequency for each character, but the order of the characters can be different. */

public class string-7
{

    public boolean Anagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] charCount = new char[26]; // Create an array to count character frequencies (assuming lowercase letters)

        // Count characters in the first string
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;// Increment the count for the character
        }

        // Decrease the count for characters in the second string
        for (char c : t.toCharArray()) {
            charCount[c - 'a']--; // Decrement the count for the character
            if (charCount[c - 'a'] < 0) {
                return false; // More occurrences in t than in s
            }
        }

        // If we reach here, all counts are zero
        return true;

    }
}
