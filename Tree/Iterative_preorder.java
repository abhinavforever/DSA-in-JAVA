package Tree;
import java.util.Stack;
public class Iterative_preorder {
    static void iterativePreorder(Node root){
        if(root==null)
            return;
        Stack<Node> st=new Stack<>();
        st.push(root);
        while (st.isEmpty()==false){
            Node curr=st.pop();
            System.out.print(curr.key+" ");
            if(curr.right!=null)
                st.push(curr.right);
            if(curr.left!=null)
                st.push(curr.left);
        }
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right=new Node(30);
        iterativePreorder(root);
    }
}