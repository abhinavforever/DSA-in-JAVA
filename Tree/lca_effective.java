package Tree;

//lowest common ancestor
public class lca_effective {
    public static Node lowestCommonAncestor(Node root, Node p,Node q){
        //base case
        if(root==null || root==p || root==q){
            return root;
        }
        Node left=lowestCommonAncestor(root.left,p,q);
        Node right=lowestCommonAncestor(root.right,p,q);

        if(left==null){
            return right;
        }
        if(right==null)
            return left;
        else
            return root;
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        System.out.println(lowestCommonAncestor(root,root.left,root.right.right).key);
    }
}