public class countofBT {
   public static int Count(Node root)
   {
    if(root ==null)
    {
        return 0;
    }
       int leftNodes= Count(root.left);
       int rightNodes= Count(root.right);

       return leftNodes + rightNodes +1;
   } 
   public static int SumofNodes(Node root)
   {
        if(root==null)
        {
            return 0;
        }
        int leftnodeSum=SumofNodes(root.left);
        int rightnodeSum=SumofNodes(root.right);

        return leftnodeSum+rightnodeSum+root.data;
        
   }
}
