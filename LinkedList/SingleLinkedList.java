public class LL
{
    public Node head;
   class Node
   {
     String data;
     Node next;

     Node(String data)
     {
        this.data=data;
        this.next=null;
     }
   }
   public void AddFirst(String data)
   {
     Node newNode=new Node(data);
      //corner case
      if(head==null)
      {
        head=newNode;
        return;
      }
      newNode.next=head;
      head=newNode;
   }
   public void AddLast(String data)
   {
    Node newNode=new Node(data);
     if(head==null)
     {
        head=newNode;
        return;
     }
     Node temp=head;
     while(temp.next!=null)
     {
        temp=temp.next;
     }
       temp=newNode;
   }
   public void PrintList()
   {
    Node temp=head;
    if(head==null)
    {
        return null;
    }
    while(temp!=null)
    {
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
   }
   public static void main(String args[])
   {
     LL list=new LL();//creating object of class ll
       list.AddFirst("A");
       list.AddFirst("B");
       list.AddLast("GF");
       list.PrintList();
   }
}