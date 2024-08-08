 import java.util.*;
 class NSE
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }
        int []ans=Nse(arr);
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
        
    }
    public static int[] Nse(int []arr)
    {
        int n=arr.length;
        int []nse=new int[n];
        Stack<Integer> stack=new Stack<>();

        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty()&& stack.peek() >=arr[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                nse[i]=-1;
            }
            else
            {
                nse[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return nse;
    }
}