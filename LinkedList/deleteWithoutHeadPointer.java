public class Solution
{
    public void deleteNode(Node del_node)
    {
        if(del_node==null||del_node.next==null)
        {
            return;
        }
        Node temp=del-node.next;
        del_node.data=temp.data;
        del_node.next=temp.next;
        temp=null;
    }

}