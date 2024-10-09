package Strings;

/*Longest Common Prefix */

public class string-4
{

    public String Prefix(String[] str) {
        int n = str.length;
        String prefix = str[0];

        for (int i = 1; i < n; i++) {
            while (str.indexOf[prefix] != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
