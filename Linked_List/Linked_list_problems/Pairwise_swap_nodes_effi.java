package Linked_List.Linked_list_problems;

public class Pairwise_swap_nodes_effi {

    static Node pairwise_swap(Node head){
        if(head==null || head.next==null)
            return head;
        Node curr=head.next.next;
        Node prev=head;
        head=head.next;
        head.next=prev;
        while (curr!=null && curr.next!=null){
            prev.next=curr.next;
            prev=curr;
            Node next=curr.next.next;
            curr.next.next=curr;
            curr=next;
        }
        prev.next=curr;
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head.next.next.next.next.next=new Node(60);

        Print(head);
        System.out.println();
        head = pairwise_swap(head);
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