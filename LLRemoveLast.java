public class LLRemoveLast {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        Node (int value)
        {
            this.value=value;
        }
    }
    LLRemoveLast(int value)
    {
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }
    public Node RemoveLast()
    {
      if(length==0)
      return null;
      
    }
}
