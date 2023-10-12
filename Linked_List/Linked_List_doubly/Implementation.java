package Linked_List.Linked_List_doubly;

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