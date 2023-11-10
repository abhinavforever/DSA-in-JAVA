package Tree;
public class Children_Sum_Property {
    static boolean isCsum(Node root){
        if (root==null)
            return true;
        if(root.left==null && root.right==null)
            return true;
        int sum=0;
        if(root.left!=null){
            sum+=root.left.key;
        }
        if(root.right!=null){
            sum+=root.right.key;
        }
        return (root.key==sum && isCsum(root.left) && isCsum(root.right));
    }
    public static void main(String[] args) {
        Node root=new Node(20);
        root.left=new Node(8);
        root.right=new Node(12);
        root.right.left=new Node(3);
        root.right.right=new Node(9);
        System.out.println(isCsum(root)); }}