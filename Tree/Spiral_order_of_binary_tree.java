package Tree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Spiral_order_of_binary_tree {
    static void printSpiral(Node root){
        if(root==null)
            return;
        Queue<Node> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        boolean reverse=false;
        q.add(root);
        while (q.isEmpty()==false)
        {
            int count=q.size();
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                if(reverse)
                    s.push(curr.key);
                else
                    System.out.print(curr.key+" ");
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            if(reverse){
                while (s.isEmpty()==false){
                    System.out.print(s.pop()+" ");
                }
            }
            reverse=!reverse;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(30);
        root.right.left=new Node(15);
        root.right.right=new Node(20);
        printSpiral(root);
    }
}