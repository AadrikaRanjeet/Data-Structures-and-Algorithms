class Dll{
    Node prev;
    int data;
    Node next;

    Dll(int data)
    {
        this.data=data;
    }
    public class myStack
    {
        Node head;
        Node mid;
        int size;
        

        void push(int new_data)
        {
           Dll new_node=new Dll(new_data);

           if(size==0)
           {
             head=new_node;
             mid=new_node;
             
           }
           else
           {
            new_node.next=head;
            head.prev=new_node;
            head=new_node;
            if(size %2 !=0)
            {
                mid=mid.prev;
            }
           }
           size++;
           
        }
        int pop()
        {
            if(size==0)
            {
                System.out.println("Stack is empty");
                return -1;
            }
            int data=head.data;
            if(size==1)
            {
                head=null;
                mid=null;
            }
            else
            {
                head=head.next;
                head.prev=null;
                if(size %2==0)
                {
                    mid=mid.prev;
                }
            }
            size--;
        }
          return data;
    }
    int findMiddle()
    {
        if(size==0)
        {
            System.out.println("Stack is empty now");
            return -1;
        }
        return mid.data;
    }
     void deleteMiddleElements()
     {
        if(size !=0)
       {
          if(size==1)
          {
            head=null;
            mid =null;
          }
          else if(size==2)
          {
             hesd=head.prev;
             mid=mid.prev;
             head.next=null;
          }
       }
       else 
       {
        mid.next.prev=mid.prev;
        mid.prev.next=mid.next;
        if(size %2==0)
        {
            mid=mid.prev;
        }
        else 
        {
            mid=mid.next;
        }
       }
      }
      public static void main(String args[])
      {
        myStack ms=new Stack();
        ms.push(11);
        ms.push(12);
        ms.push(23);
        ms.push(44);
        System.out.println(ms.pop());
        System.out.println("Middle Element : " + ms.findMiddle());
        ms.deleteMiddleElement();
      }

}