import java.util.*;
class TreeNode
{
    int data;
    TreeNode left,right;
    TreeNode(int data)
    
    {
        this.data=data;
    }
}
public class Main
{
   static Scanner in=new Scanner(System.in);
    public static TreeNode create()
    {
        int data=in.nextInt();
        if(data==-1)
        return null;
        TreeNode root=new TreeNode(data);
        root.left=create();
        root.right=create();
        return root;
    }
    public static TreeNode lca(TreeNode root,int a,int b)
    {
        if(root==null||root.data==a||root.data==b)
        return root;
        TreeNode left=lca(root.left,a,b);
        TreeNode right=lca(root.right,a,b);
         if(left!=null&&right!=null)
         return root;
          return (left!=null)?left:right;
    }
	public static void main(String[] args) {
	TreeNode root=create();
	int a=in.nextInt();
	int b=in.nextInt();
	TreeNode ans=lca(root,a,b);
	System.out.println(ans.data);
	}
}
