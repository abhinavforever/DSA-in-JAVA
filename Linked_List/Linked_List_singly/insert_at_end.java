package Linked_List.Linked_List_singly;

public class insert_at_end {
    public static void main(String[] args) {
        Node head=null;
        head=insert_end(head,10);
        head=insert_end(head,20);
        head=insert_end(head,30);
        Print(head);
    }
    static Node insert_end(Node head,int x){
        Node temp=new Node(x);
        if(head==null)
            return temp;
        Node curr=head;
        while (curr.next!=null)
            curr=curr.next;
        curr.next=temp;
        return head;
    }
    static void Print(Node head) {
        Node cur = head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }

    }
}