package Linked_List.circular_doubly;

import org.w3c.dom.NodeList;

import java.util.Scanner;

public class insert_at_head {

    static Node insert_Head(Node head, int x){
        Node temp=new Node(x);
        if(head==null){
            temp.next=temp;
            temp.prev=temp;
            return temp;
        }
        temp.prev=head.prev;
        temp.next=head;
        head.prev.next=temp;
        head.prev=temp;
        return temp;
    }
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
        Scanner sc=new Scanner(System.in);
        System.out.println("\nenter your number that you want to insert :");
        int x=sc.nextInt();
        head=insert_Head(head,x);
        Print(head);
    }
    static void Print(Node head){
        if(head==null)
            return;
        System.out.print(head.data+" ");
        for(Node r=head.next;r!=head;r=r.next)
            System.out.print(r.data+" ");
    }
}