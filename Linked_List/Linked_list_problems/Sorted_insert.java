package Linked_List.Linked_list_problems;

import java.util.Scanner;

public class Sorted_insert {
    static Node sortedInsert(Node head, int x){
        Node temp=new Node(x);
        if(head==null)
            return temp;
        if(x<head.data){
            temp.next=head;
            return temp;
        }
        Node curr=head;
        while (curr.next!=null && curr.next.data<x){
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        Print(head);
        Scanner sc=new Scanner(System.in);
        System.out.println("\nenter data: ");
        int x=sc.nextInt();
        head=sortedInsert(head,x);
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