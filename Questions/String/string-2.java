package Strings;

/*Reverse Words in a String */

public class string-2
{

    public String Reverse(String s) {
        String[] parts = s.split("\\s+");
        StringBuilder ans = new StringBuilder("");
        int n = parts.length;
        for (int i = n - 1; i >= 0; i--) {
            ans.append(parts[i]).append(" ");
        }
        return ans.toString().trim();
    }
}
