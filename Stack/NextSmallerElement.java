import java.util.*;
public class NextSmallerElement {
    public static int[] Solution(int num[])
    {
         int n=num.length;
         int nse[]=new int[n];
         Stack<Integer> stack=new Stack<>();
         for(int i=2*n-1;i>=0;i--)
         {
            while(!stack.isEmpty()&&stack.peek()>=num[i%n])
            {
                stack.pop();

            }
                if(i<n)
                {
                    if(!stack.isEmpty())
                    {
                        nse[i]=stack.peek();
                    }
                    else
                    {
                        nse[i]=-1;
                    }
                }
                stack.push(num[i%n]);
         }
         return nse;
    }
    public static void main(String args[])
    {
        NextSmallerElement nc=new NextSmallerElement();
         Scanner sc=new Scanner(System.in);
         int n = sc.nextInt();
        int[] num = new int[n];
        
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        
        int[] result = nc.Solution(num);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
