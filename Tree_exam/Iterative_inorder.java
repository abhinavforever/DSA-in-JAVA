package Tree_exam;
import java.util.Stack;
public class Iterative_inorder {
    static void iterativeInorder(Node root){
        Stack<Node> st=new Stack<>();
        Node curr=root;
        while (curr!=null || st.isEmpty()==false){
            while (curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();
            System.out.print(curr.key+" ");
            curr=curr.right;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right=new Node(30);
        iterativeInorder(root); }}