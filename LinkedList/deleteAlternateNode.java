class Solution{
    public void deleteAlternate(Node head)
    {
        if(head==null||head.next==null)
        {
            return;
        }
        Node current=head;
        Node nextNext=head;
        while(current !=null && current.next !=null)
        {
            nextNext=nextNext.next.next;
            current.next=nextNext;
            current=nextNext;
        }
    }
}