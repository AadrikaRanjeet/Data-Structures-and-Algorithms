public class heightofBT {
    public static int Height(Node root)
    {
        if(root ==null)
        {
            return 0;
        }
        int leftHeight=Height(root.left);
        int rightHeight=Height(root.right);

      int maxHeight=Math.max(leftHeight, rightHeight)+1;
       return maxHeight;
    }
}
