package Tree;
public class Binary_Tree_from_inorder_and_preorder {
    static int preIndex=0;
    static Node cTree(int in[],int pre[],int is,int ie){
        if(is>ie)
            return null;
        Node root=new Node((pre[preIndex++]));

        int inIndex=0;
        for(int i=is;i<=ie;i++){
            if(in[i]==root.key){
                inIndex=i;
                break;
            }
        }
        root.left=cTree(in,pre,is,inIndex-1);
        root.right=cTree(in,pre,inIndex+1,ie);
        return root;
    }
    public static void main(String[] args) {
        int in[]={20,10,40,30,50};
        int pre[]={10,20,30,40,50};
        Node root=cTree(in,pre,0,in.length-1);
        inorder(root);
        System.out.println();
        preOrder(root);
    }
    static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    static void preOrder(Node root){
        if(root!=null)
        {
            System.out.print(root.key+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}