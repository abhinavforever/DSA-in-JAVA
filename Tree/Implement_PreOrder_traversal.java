package Tree;

public class Implement_PreOrder_traversal {
    static void preOrder(Node root){
        if(root!=null)
        {
            System.out.print(root.key+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        preOrder(root);
    }
}