package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Level_order_Traversal_Line_By_Line_Method2 {
    static void printLevelOrderLine( Node root ){
        if(root==null)
            return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while (q.isEmpty()==false){
            int count=q.size();
            for (int i=0;i<count;i++){
                Node curr=q.poll();
                System.out.print(curr.key+" ");
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(15);
        root.left.left=new Node(30);
        root.right=new Node(20);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        root.right.left.left=new Node(60);
        root.right.left.right=new Node(70);
        printLevelOrderLine(root);
    }
}