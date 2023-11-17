package Tree;

public class diameter_of_binary_tree_effi {
    static int res=0;
    static int height(Node root){
        if(root==null)
            return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        res=Math.max(res,1+lh+rh);
        return (1+Math.max(lh,rh));
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(30);
        root.right.left=new Node(15);
        root.right.right=new Node(20);
        height(root);
        System.out.println(res);
    }
}