class Solution
{
    public Boolean ifCircular(Node head)
    {
        if(head==null ||head.next==null)
        {
            return false;
        }
        Node fast=head;
        Node slow=head;
        while(fast !=null && fast.next !=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast==slow)
        {
            return true;
        }
        return fast;
    }
}