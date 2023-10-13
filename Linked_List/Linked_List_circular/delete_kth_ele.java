package Linked_List.Linked_List_circular;

import java.util.Scanner;

public class delete_kth_ele {

    static Node deleteKth(Node head,int k){
        if(head==null)
            return head;
        if(k==1)
            return deleteHead(head);
        Node curr=head;
        for (int i=0;i<k-2;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;

    }

    static Node deleteHead(Node head){
        if(head==null)
            return null;
        if(head.next==head)
            return null;
        head.data=head.next.data;//data of head deleted
        head.next=head.next.next;//data of next node had been stored to head in previous step.Now next of head has also been modified to next of head's next.So we basically just deleted head by making head same as head's next node earlier
        return head;
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
        System.out.println("enter the node you want to delete :");
        int k=sc.nextInt();
        deleteKth(head,k);
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