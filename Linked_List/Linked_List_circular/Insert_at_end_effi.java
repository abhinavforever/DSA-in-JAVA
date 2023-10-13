package Linked_List.Linked_List_circular;

import java.util.Scanner;

public class Insert_at_end_effi {
    static Node insertEnd(Node head,int x){
        Node temp=new Node(x);
        if(head==null){
            temp.next=temp;
            return temp;
        }
        else {
            temp.next=head.next;
            head.next=temp;
            int t=head.data;
            head.data=temp.data;
            temp.data=t;
            return temp;//temp is now new head
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(5);
        head.next.next=new Node(20);
        head.next.next.next=new Node(15);
        head.next.next.next.next=head;
        Print(head);
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want to insert at the end :");
        int k=sc.nextInt();
        head=insertEnd(head,k);
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