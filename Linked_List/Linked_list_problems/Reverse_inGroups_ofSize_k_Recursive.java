package Linked_List.Linked_list_problems;

import java.util.Scanner;

public class Reverse_inGroups_ofSize_k_Recursive {

    static Node reversek(Node head,int k){
        Node curr=head,next=null,prev=null;
        int count=0;
        while (curr!=null && count<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null){
            Node rest_head=reversek(next,k);//prev is resthead
            head.next=rest_head;
        }
        return prev; //prev is new head
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head.next.next.next.next.next=new Node(60);

        Print(head);
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of k: ");
        int k=sc.nextInt();
        head=reversek(head,k);
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