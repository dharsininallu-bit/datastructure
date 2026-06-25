import java.util.*;
public class Main
{
   static  class  Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            
            this.data=data;
            left=right=null;
        }
    }
    static Scanner in=new Scanner(System.in);
    public static Node create()
    {
        int data=in.nextInt();
        if(data==-1)
        return null;
        
        Node root=new Node(data);
        root.left=create();
        root.right=create();
        
        
        return root;
    }
    static boolean search(Node root,int target)
    {
        if(root==null)
        return false;
        if(root.data==target)
        return true;
        else if(root.data!=target)
        return search(root.left,target)||search(root.right,target);
        
        return false;
    }
    public static void preorder(Node root)
    {
        if(root == null)
        return;

        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    
     public static void inorder(Node root)
    {
      if(root == null)
        return;

        inorder(root.left);
          System.out.print(root.data);
        inorder(root.right);
    }
    
     public static void postorder(Node root)
    {
        if(root == null)
        return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);
    }
	public static void main(String[] args) {
	     Node root=create();
	     int target=in.nextInt();
	     System.out.println(search(root,target));
	     preorder(root);
	     System.out.println();
	     inorder(root);
	     System.out.println();
	     postorder(root);
	     
	}
}
