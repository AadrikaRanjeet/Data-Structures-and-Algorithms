public class Stack
{
    static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    static class Stack
    {
        public Node head;
        //check if stack is empty or not
        public static boolean isEmpty()
        {
            return head==null;
        }
        static void push(int data)
        {
            //create a new node for push operation
            Node newNode=new Node(data);

            //based on the isempty function's passed value we will further proceed
            if(isEmpty())
            {
                head=newNode;
                return;
            }
             newNode.next=head;
             head=newNode;
        }

        //pop function delete as well as removes the node
        static int pop()
        {
           int top=head.data;
          if(isEmpty())
          {
            return -1;
          }
          head=head.next;
          return top;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[])
    {
         //creating a stack
         Stack s=new Stack();
         s.push(1);
         s.push(2);
         s.push(3);
         s.push(4);
         

         while(!s.isEmpty())
         {
            System.out.println(s.peek());
            s.pop(); 
        }
    }
}