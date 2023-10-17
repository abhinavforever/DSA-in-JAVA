package Linked_List.Linked_list_problems;

import java.util.Scanner;

public class find_nth_from_end {
    static void printNthfromend(Node head, int n){
        int len=0;
        for(Node curr = head; curr!=null; curr=curr.next)
            len++;
        if(len<n){
            return;
        }
        Node curr=head;
        for(int i=1;i<len-n+1;i++){
            curr=curr.next;
        }
        System.out.println(curr.data);
    }

    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        Print(head);
        Scanner sc=new Scanner(System.in);
        System.out.println("\nwhich node from end u want to print? ");
        int n=sc.nextInt();
        printNthfromend(head,n);
    }
    static void Print(Node head) {
        Node cur = head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }

    }
}