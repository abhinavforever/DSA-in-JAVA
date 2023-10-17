package Linked_List.Linked_list_problems;

public class Pairwise_swap_nodes {

    static void pairwise_swap(Node head){
        Node curr=head;
        while (curr!=null && curr.next!=null){
            int temp=curr.data;
            curr.data=curr.next.data;
            curr.next.data=temp;

            curr=curr.next.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head.next.next.next.next.next=new Node(60);

        Node head2=new Node(1);
        head2.next=new Node(2);
        head2.next.next= head.next.next;

        Print(head);
        System.out.println();
        Print(head2);
        System.out.println();
        int data=pairwise_swap(head);
        System.out.println(data);
    }
    static void Print(Node head) {
        Node cur = head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }

    }
}