 class Stack {
    private Node top;
    int length;

     class Node
    {
       int value;
       Node next;
       Node(int value)
       {
           this.value=value;
       }
    }
    public Stack(int value)
    {
        Node newNode= new Node(value);//creating a new node,adding it to stack,and passing it a value
        top=newNode;//top will point to this newly created node
        length=1; //this means there

    }
    public void printStack()
    {
        Node temp=top;
        while(temp!= null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
}
