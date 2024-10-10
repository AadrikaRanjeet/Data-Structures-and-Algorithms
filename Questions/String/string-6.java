package Strings;

/*Rotate String
 * Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.
 */

public class string-6
{

    public boolean Rotate(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String target = s + s;
        if (target.contains(goal)) {
            return true;
        }
        return false;
    }
}
