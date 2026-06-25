
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
    
    public static void levelorder(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            Node curr=q.poll();
            System.out.print(curr.data);
            if(curr.left!=null)
            q.offer(curr.left);
             if(curr.right!=null)
            q.offer(curr.right);
        }
    }
     
    public static void main(String[]args)
    {
        Node root=create();
        levelorder(root);
    }
}
