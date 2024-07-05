public class AssignCookies{
    public static int Cookies(int []g, int []s)
    {
          //Sort both Arrays
          Arrays.sort(g);
          Arrays.sort(s);

          int i=0;
          int j=0;
          while(i<g.length && j<s.length)
          {
            if(s[j]>=g[i])
            {
                i++;
            }
            j++;
          }
          return i;
    }
}