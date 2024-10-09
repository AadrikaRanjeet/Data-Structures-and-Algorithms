package Strings;

/*Largest Odd Number in String */

public class string-3
{

    public int Odd(String s) {
        int n = s.length();
        char c;
        int num;
        for (int i = n - 1; i > 0; i--) {
            c = s.charAt(i);
            num = Character.getNumericValue(c);
            if (c % 2 != 0) {
                return s.substring(0, i + 1);
            }
        }
        return "";
    }
}
