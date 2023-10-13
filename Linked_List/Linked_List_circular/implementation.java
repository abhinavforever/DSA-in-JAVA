package Linked_List.Linked_List_circular;

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
public class implementation {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(5);
        head.next.next=new Node(20);
        head.next.next.next=new Node(15);
        head.next.next.next.next=head;
        Print(head);
    }
    static void Print(Node head) {
        if(head==null)
            return;
        System.out.print(head.data+" ");
        for(Node r=head.next;r!=head;r=r.next)
            System.out.print(r.data+" ");

    }
}