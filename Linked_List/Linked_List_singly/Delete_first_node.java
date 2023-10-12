package Linked_List;

public class Delete_first_node {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        printList(head);
        head=delHead(head);
        System.out.println();
        printList(head);
    }
    static Node delHead(Node head){
        if (head==null)
            return null;
        else
            return head.next;
    }
    static void printList(Node head){
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}