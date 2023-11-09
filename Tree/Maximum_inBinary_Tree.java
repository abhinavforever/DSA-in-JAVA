package Tree;

public class Maximum_inBinary_Tree {
    static int getMax(Node root){
        if(root==null)
            return Integer.MIN_VALUE;
        else
            return Math.max(root.key,Math.max(getMax(root.left),getMax(root.right)));
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
        System.out.println(getMax(root));
    }
}