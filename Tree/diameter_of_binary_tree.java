package Tree;

public class diameter_of_binary_tree {
    static int height(Node root){
        if(root==null)
            return 0;
        else
            return 1+Math.max(height((root.left)),height(root.right));
    }
    static int diameter(Node root){
        if(root==null)
            return 0;
        int d1=1+height(root.left)+height(root.right);
        int d2=diameter(root.left);
        int d3=diameter(root.right);
        return Math.max(d1,Math.max(d2,d3));
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(30);
        root.right.left=new Node(15);
        root.right.right=new Node(20);
        System.out.println(diameter(root));
    }
}