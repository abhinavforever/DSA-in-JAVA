package Linked_List.Linked_List_singly;

public class insert_at_begin {
    public static void main(String[] args) {
        Node head=null;
        head=insert_begin(head,30);
        head=insert_begin(head,20);
        head=insert_begin(head,10);
        Print(head);
    }
    static Node insert_begin(Node head,int x){
        Node temp=new Node(x);
        temp.next=head;
        return temp;
    }
    static void Print(Node head) {
        Node cur = head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }

    }
}