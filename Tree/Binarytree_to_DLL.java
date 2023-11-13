package Tree;

import java.util.List;
public class Binarytree_to_DLL {
    static Node prev=null;
    static Node BTtoDLL(Node root){
        if(root==null) return root;
        Node head=BTtoDLL(root.left);
        if(prev==null){
            head=root;
        }
        else{
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        BTtoDLL(root.right);
        return head;
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(30);
        root.right.left=new Node(15);
        root.right.right=new Node(20);
        Node head=BTtoDLL(root);
        Print(head);
    }
    static void Print(Node head) {
        Node cur = head;
        while(cur!=null){
            System.out.print(cur.key+" ");
            cur = cur.right;
        }

    }
}