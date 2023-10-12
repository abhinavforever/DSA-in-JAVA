package Linked_List.Linked_List_singly;

import java.util.Scanner;

public class insert_at_pos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        printList(head);

        int pos=sc.nextInt();
        int data=sc.nextInt();
        head=insertPos(head,pos,data);
        printList(head);

    }
    static Node insertPos(Node head,int pos,int data){
        Node temp=new Node(data);
        if(pos==1){
            temp.next=head;
            return temp;
        }
        Node curr=head;
        for (int i = 1; i <=pos-2 && curr!=null ; i++) {
            curr=curr.next;
        }
        if(curr==null)
            return head;
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }
    static void printList(Node head){
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}