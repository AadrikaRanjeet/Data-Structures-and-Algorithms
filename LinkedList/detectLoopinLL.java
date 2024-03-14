class Solution
{
    public Boolean detectLoop(Node head)
    {
        if(head==null || head.next==null)
        {
            return false;
        }
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow)
            {
                return true;
            }

        }
         return false;
    }

}