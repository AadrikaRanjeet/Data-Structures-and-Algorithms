 class StackPush
 {
  private Node top1;
  private int height1;

  class Node{
    int value;
    Node next;

    Node(int value)
    {
      this.value=value;
    }
  }
  StackPush (int value)
  {
    Node newNode=new Node(value);
    top1=newNode;
    height1=1;
  }
    public void Push(int value)
    {
      Node newNode = new Node(value);
      if(height1==0)
      {
        top1=newNode;
      }
      else{
        newNode.next=top1;
        top1=newNode;
      }
      height1++;
    }
    public void PrintStack()
    {
      Node temp=top1;
      while(temp!=null)
      {
        System.out.println(temp.value);
        temp=temp.next;
      }
    }
  }
 