package Linked_List.Linked_List_doubly;

import java.util.Scanner;

public class insert_at_begin {

    static Node insertBegin(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        if(head!=null)
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
        Print(head);
        Scanner sc=new Scanner(System.in);
        System.out.println("\nenter ele to be inserted :");
        int x=sc.nextInt();
        head=insertBegin(head,x);
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