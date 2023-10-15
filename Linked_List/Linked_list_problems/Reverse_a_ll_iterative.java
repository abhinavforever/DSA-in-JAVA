package Linked_List.Linked_list_problems;

public class Reverse_a_ll_iterative {
    static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        while (curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;//prev is new head
    }

    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        Print(head);
        System.out.println();
        head=reverse(head);
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