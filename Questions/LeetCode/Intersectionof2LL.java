import java.lang.classfile.components.ClassPrinter.ListNode;

public class Intersectionof2LL 
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        if(headA==null || headB==null)
        {
            return null;
        }

        ListNode temp1=headA;
        ListNode temp2=headB;

        while(temp1 != temp2)
        {
            if(temp1==null)
            {
                temp1=headB;//move to the head of next List
            }
            else
            {
                temp1=temp1.next;
            }
            if(temp2==null)
            {
                temp2=headA;//move to the head of next List
            }
            else
            {
                temp2=temp2.next;
            }
        }
        return temp1;
        
    }
}
