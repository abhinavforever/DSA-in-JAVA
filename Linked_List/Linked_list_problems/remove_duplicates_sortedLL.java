package Linked_List.Linked_list_problems;

public class remove_duplicates_sortedLL {

    static void removeDuplicates(Node head){
        Node curr=head;
        while (curr!=null && curr.next!=null){
            if(curr.data == curr.next.data)
                curr.next=curr.next.next;
            else
                curr=curr.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(20);
        head.next.next.next=new Node(30);
        head.next.next.next.next=new Node(30);
        head.next.next.next.next.next=new Node(30);
        Print(head);
        removeDuplicates(head);
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