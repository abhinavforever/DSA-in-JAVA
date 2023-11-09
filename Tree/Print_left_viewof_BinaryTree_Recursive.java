package Tree;

public class Print_left_viewof_BinaryTree_Recursive {
    static int maxlevel=0;
    static void printLeft(Node root,int level){
        if(root==null)
            return;
        if(maxlevel<level){
            System.out.print(root.key+" ");
            maxlevel=level;
        }
        printLeft(root.left,level+1);
        printLeft(root.right,level+1);
    }
    static void printLeftView(Node root){
        printLeft(root,1);
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
        printLeftView(root);
    }
}