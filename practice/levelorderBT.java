import java.util.*;
public class levelorderBT
{
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree
    {
        static int idx = -1;
        public static Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }
        public static void preOrder(Node root)
        {
            //base case
            if(root==null)
            {
                return;
            }
           System.out.print(root.data +" ");
           preOrder(root.left);
           preOrder(root.right);
        }
        public static void inorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ,");
            inorder(root.right);
        }
        public static void Postorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data+" ");
        }
        public static void Levelorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty())
            {
                Node currNode=q.remove();
                if(currNode==null)
                {
                    System.out.println();
                    if(q.isEmpty())
                    {
                        break;//exit loop
                    }
                    else{
                        //add null
                        q.add(null);
                    }
                }
                else
                {
                     System.out.print(currNode.data+" ");
                     if(currNode.left!=null)
                     {
                        q.add(currNode.left);
                     }
                     if(currNode.right!=null)
                     {
                        q.add(currNode.right);
                     }
                }
            }
        }
    public static void main(String args[])
    {   
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root= tree.buildTree(nodes);
       
       // preOrder(root);
       // inorder(root);
      //  Postorder(root);
      Levelorder(root);
    }
}