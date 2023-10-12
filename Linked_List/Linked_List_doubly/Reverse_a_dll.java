package Linked_List.Linked_List_doubly;

public class Reverse_a_dll {

    static Node ReverseDll(Node head){
        if(head==null || head.next==null)
            return head;
        Node prev=null;
        Node curr=head;
        while (curr!=null){
            prev=curr.prev;
            curr.prev=curr.next;
            curr.next=prev;
            curr=curr.prev;
        }
        return prev.prev;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        Print(head);
        head=ReverseDll(head);
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