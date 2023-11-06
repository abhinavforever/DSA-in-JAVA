package Tree;

public class height_of_binary_tree {
    static int height(Node root){
        if(root==null)
            return 0;
        else
            return Math.max(height(root.left),height(root.right))+1;
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        System.out.println("Our convention for height is that height = no. of nodes along the longest path from root to one of the leaves");
        System.out.println("height of given binary tree="+height(root));
    }
}