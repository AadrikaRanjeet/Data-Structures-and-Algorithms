import java.util.*;


public class stackusingqueue
{
    class myStack
    {
        Queue<Integer> q1;
        Queue<Integer> q2;

        public myStack()
        {
            q1=new LinkedList<>();
            q2=new LinkedList<>();

        }
        public void Push(int x)
        {
            q2.add(x);
            //add all elements from q1 to q2
            while(!q1.isEmpty())
            {
                q2.add(q1.remove());
            }
            //swap all elements between q1 and q2
            Queue<Integer> temp=q1;
            q1=q2;
            q2=temp;
        }
        public int Pop()
        {
            if(q1.isEmpty())
            {
                return -1;
            }
            return q1.remove();
        }
        public int top()
        {
            if(q1.isEmpty())
            {
                return -1;
            }
            return q1.peek();
        }
        public boolean isEmpty()
        {
            return q1.isEmpty();
        }
    }
   

}
