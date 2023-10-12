package Linked_List.Linked_List_doubly;
import java.util.Scanner;
public class insert_at_end {
    static Node insertEnd(Node head,int x){
        Node temp=new Node(x);
        if(head==null)
            return temp;
        Node curr=head;
        while (curr.next!=null)
            curr=curr.next;
        curr.next=temp;
        temp.prev=curr;
        return head;}
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
        head=insertEnd(head,x);
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