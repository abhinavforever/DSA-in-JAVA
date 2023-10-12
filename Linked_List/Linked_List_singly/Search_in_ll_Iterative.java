package Linked_List.Linked_List_singly;

import java.util.Scanner;

public class Search_in_ll {
    static int search(Node head,int x){
        int pos=1;
        Node curr=head;
        while (curr!=null){
            if(curr.data==x)
                return pos;
            else {
                pos++;
                curr=curr.next;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        Print(head);
        System.out.println("\nenter number to be searched:");
        int num=sc.nextInt();
        System.out.println("its position is :");
        System.out.println(search(head,num));
    }
    static void Print(Node head) {
        Node cur = head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }

    }

}