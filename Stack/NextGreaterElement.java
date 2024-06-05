import java.util.Stack;

public class NextGreaterElement {
    
    public static int[] nge(int arr[])
    {
        int n=arr.length;
        int []result=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=2*n-1;i>=0;i--)
        {
            while(!st.isEmpty()&&st.peek()<=arr[i%n])
            {
                st.pop();
            }
            if(i<n)
            {
                if(!st.isEmpty() )
                {
                    result[i]=st.peek();
                }
                else
                {
                    result[i]=-1;
                }
            }
            st.push(arr[i%n]);
        }
        return result;
    }
    public static void main(String args[])
    {
        int arr[]={5,4,1,2,6,0};
        int arr2[]=nge(arr);
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}