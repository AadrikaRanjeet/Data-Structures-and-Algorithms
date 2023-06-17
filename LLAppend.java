public class LLAppend {
    private Node head;
    private Node tail;
    private int length ;

    class Node
    {
      int value;
      Node next;

      Node(int value)
      {
        this.value=value;
      }
    }
      LLAppend(int value)
      {
        Node newNode=new Node(value); //creating a newnode
        head=newNode;
        tail=newNode;
        length=1;
 
      }
    public void AppendList(int value)
    {
        Node newNode=new Node(value);
        if(length==0)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
          tail.next=newNode;
        tail=newNode;
        }
        length++; 
    }
    public void PrintList()
    {
       Node temp=head;
       while(temp!=null)
       {
        System.out.println(temp.value);
        temp=temp.next;
       }
    }
}
