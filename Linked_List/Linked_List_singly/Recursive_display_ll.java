package Linked_List.Linked_List_singly;

public class Recursive_display_ll {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        rPrint(head);
    }
    static void rPrint(Node head){
        if(head==null)
            return;
        System.out.print(head.data+" ");
        rPrint(head.next);
    }
}