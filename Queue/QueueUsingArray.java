public class Solution
{
    static class Queue
    {
        static int arr[];
        static int size;
        static int rear=-1;
        //we dont have to create front , bcoz it is 0 in every case
        
        Queue(int size)
        {
            //since we dont know what should be the size of an array so we will pass the size and will declare the size of an array here
          arr=new int[size];
          this.size=size;//size ko store bhi kr lete h

        }
        public static boolean isEmpty()
        {
            return rear==-1;
        }
    }
        //enqueue
        public static void add(int data)
        {
           if(rear==size-1)
           {
            System.out.println("Queue is full");
            return;
           } 
            rear++;
            arr[rear]=data;
        }
        //dequeue
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Empty queue");
                return -1;
            }
            //fifo toh remove krne ke liye first index ko access krna hota hai
            int front=arr[0];
            for(int i=0;i<rear;i++)
            {
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        //peek
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
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