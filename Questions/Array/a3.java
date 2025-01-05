public class a3 {
    public char[] Reverse(char[] s) {
        int i = 0, j = s.length - 1;
        char temp;
        while (i < j) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        return s;
    }
}
