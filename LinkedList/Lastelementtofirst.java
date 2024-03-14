class Solution
{
    Node fromLastToFirst(Node head)
    {
        if(head== null || head.next==null)
        {
            return head;
        }
        Node current=head;
         Node prev=head;
         whhile(current.next!=null)
         {
            prev=current;
            current=current.next;
         }
         prev.next=null;
         current.next=head;
         current=head;

         return head;
         
         
    }
}