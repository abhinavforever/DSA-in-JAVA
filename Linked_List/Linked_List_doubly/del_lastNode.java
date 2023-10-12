package Linked_List.Linked_List_doubly;
public class del_lastNode {
    static Node del_lastnode(Node head){
        if(head==null)
            return null;
        if(head.next==null)
            return null;
        Node curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.prev.next=null;
        return head;}
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        Print(head);
        head=del_lastnode(head);
        System.out.println();
        Print(head);
    }
    static void Print(Node head) {
        Node cur = head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
    }
}