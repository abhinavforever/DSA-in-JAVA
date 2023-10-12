package Linked_List.Linked_List_doubly;

import java.util.Scanner;

public class delete_head {

    static Node del_head(Node head){
        if(head==null)
            return null;
        if(head.next==null)
            return null;
        else {
            head=head.next;
            head.prev=null;
            return head;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        Print(head);
        head=del_head(head);
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