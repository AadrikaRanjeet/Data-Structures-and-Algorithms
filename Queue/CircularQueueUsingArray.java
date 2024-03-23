public class Solution
{
    public class Queue
    {
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;
        Queue(int n)
        {
            this.size=n;
            arr[]=new int[n];
        }

    }
    public static boolean isEmpty()
    {
        return rear==-1 && front==-1;
    }
    public static boolean isFull()
    {
        return (rear+1)%size==front;
    }
    public static void Enqueue(int data)
    {
       if(isFull)
       {
          //queue is full
          System.out.println("Queue is full");
          return;
       }
       //first element add
       if(front==-1)
       {
        front=0;
       }
       rear=(rear+1)%size;
       arr[rear]=data;
    }

    //Dequeue
    public static int remove()
    {
         if(isEmpty())
         {
            System.out.println("Queue is empty");
            return;
         }
         int result=arr[front];
         //single element
         if(rear==front)
         {
            rear=front=-1;
         }
         else
         {
            front=(front+1)%size;
         }
         return result;
    }

    //peek
    public static int peek()
    {
        if(isEmpty())
        {
            return;
        }
       return arr[front];
    }
    
    public static void main(String args[])
    {
        Solution s=new Solution();
        s.add(1);
        s.add(2);
        s.add(3);
        while(!s.isEmpty())
        {
            System.out.print(s.peek());
            q.remove();

        }
    }
}