package Tree;
public class Check_for_BalancedTree_Efficient {
    static int isBalanced(Node root){
        if(root==null)
            return 0;
        int lh=isBalanced(root.left);
        if(lh==-1)
            return -1;
        int rh=isBalanced(root.right);
        if(rh==-1)
            return -1;

        if(Math.abs(lh-rh)>1)
            return -1;
        else
            return Math.max(lh,rh)+1;
    }
    static int height(Node root){
        if(root==null)
            return 0;
        else
            return Math.max(height(root.left),height(root.right))+1;
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(30);
        root.right.left=new Node(15);
        root.right.right=new Node(20);
        if (isBalanced(root)==-1)
            System.out.println("false");
        else
            System.out.println("true and height is "+isBalanced(root));
    }
}