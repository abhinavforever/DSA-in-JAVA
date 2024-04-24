//package Tree;
//public class Binary_Tree_from_inorder_and_preorder {
//    static int preIndex=0;
//    static Node cTree(int in[],int pre[],int is,int ie){
//        if(is>ie)
//            return null;
//        Node root=new Node((pre[preIndex++]));
//
//        int inIndex=0;
//        for(int i=is;i<=ie;i++){
//            if(in[i]==root.key){
//                inIndex=i;
//                break;
//            }
//        }
//        root.left=cTree(in,pre,is,inIndex-1);
//        root.right=cTree(in,pre,inIndex+1,ie);
//        return root;
//    }
//    public static void main(String[] args) {
//        int in[]={20,10,40,30,50};
//        int pre[]={10,20,30,40,50};
//        Node root=cTree(in,pre,0,in.length-1);
//        inorder(root);
//        System.out.println();
//        preOrder(root);
//    }
//    static void inorder(Node root){
//        if(root!=null){
//            inorder(root.left);
//            System.out.print(root.key+" ");
//            inorder(root.right);
//        }
//    }
//    static void preOrder(Node root){
//        if(root!=null)
//        {
//            System.out.print(root.key+" ");
//            preOrder(root.left);
//            preOrder(root.right);
//        }
//    }
//}

package Tree;
public class Binary_Tree_from_inorder_and_preorder {
    static int preIdx=0;
    static Node constructTree(int inorder[],int preorder[],int inStart,int inEnd){
        if(inStart > inEnd)
            return null;
        Node rootNode = new Node((preorder[preIdx++]));

        int inIndex=0;
        for(int i=inStart;i<=inEnd;i++){
            if(inorder[i]==rootNode.key){
                inIndex=i;
                break;
            }
        }
        rootNode.left = constructTree(inorder,preorder,inStart,inIndex-1);
        rootNode.right = constructTree(inorder,preorder,inIndex+1,inEnd);
        return rootNode;
    }
    public static void main(String[] args) {
        int inorder[]={20,10,40,30,50};
        int preorder[]={10,20,30,40,50};
        Node root = constructTree(inorder,preorder,0,inorder.length-1);
        inorderTraversal(root);
        System.out.println();
        preorderTraversal(root);
    }
    static void inorderTraversal(Node root){
        if(root!=null){
            inorderTraversal(root.left);
            System.out.print(root.key+" ");
            inorderTraversal(root.right);
        }
    }
    static void preorderTraversal(Node root){
        if(root!=null)
        {
            System.out.print(root.key+" ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }
}
