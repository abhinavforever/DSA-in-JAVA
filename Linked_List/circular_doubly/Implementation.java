package Linked_List.circular_doubly;

class Node{
    int data;
    Node prev;
    Node next;
    Node(int d){
        data=d;
        prev=null;
        next=null;
    }
}
public class Implementation {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        temp2.next=head;
        head.prev=temp2;
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