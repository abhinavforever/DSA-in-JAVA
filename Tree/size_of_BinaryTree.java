package Tree;

public class size_of_BinaryTree {
    static int getSize(Node root){
        if(root==null)
            return 0;
        else
            return 1+getSize(root.left)+getSize(root.right);
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
        System.out.println(getSize(root));
    }
}