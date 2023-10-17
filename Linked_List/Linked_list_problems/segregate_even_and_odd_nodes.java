package Linked_List.Linked_list_problems;//package Linked_List.Linked_list_problems;
import java.util.Scanner;
public class segregate_even_and_odd_nodes {
    static Node segregate(Node head){
        Node es=null,ee=null,os=null,oe=null;
        for(Node curr=head;curr!=null;curr=curr.next){
            int x=curr.data;
            if(x%2==0){
                if(es==null){
                    es=curr;
                    ee=es;
                }
                else {
                    ee.next=curr;
                    ee=ee.next;
                }
            }
            else {
                if(os==null){
                    os=curr;
                    oe=os;
                }
                else {
                    oe.next=curr;
                    oe=oe.next;
                }
            }
        }
        if(os==null || es==null){
            return head;
        }
        ee.next=os;
        oe.next=null;
        return es;
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
        Node head1=segregate(head);
        Print(head1);
    }
    static void Print(Node head) {
        Node cur = head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }

    }
}

//class Node1 {
//    int data;
//    Node1 next;
//
//    Node1(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class SegregateEvenAndOddNodes {
//    static Node1 segregateEvenAndOddNodes(Node1 head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        Node1 evenHead = null, evenTail = null, oddHead = null, oddTail = null;
//        Node1 current = head;
//
//        while (current != null) {
//            if (current.data % 2 == 0) {
//                if (evenHead == null) {
//                    evenHead = current;
//                    evenTail = current;
//                } else {
//                    evenTail.next = current;
//                    evenTail = current;
//                }
//            } else {
//                if (oddHead == null) {
//                    oddHead = current;
//                    oddTail = current;
//                } else {
//                    oddTail.next = current;
//                    oddTail = current;
//                }
//            }
//            current = current.next;
//        }
//
//        if (evenTail != null) {
//            evenTail.next = oddHead;
//        }
//
//        if (oddTail != null) {
//            oddTail.next = null;
//        }
//
//        return evenHead != null ? evenHead : oddHead;
//    }
//
//    static void printList(Node1 head) {
//        Node1 current = head;
//        while (current != null) {
//            System.out.print(current.data + " ");
//            current = current.next;
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        Node1 head = new Node1(10);
//        head.next = new Node1(5);
//        head.next.next = new Node1(20);
//        head.next.next.next = new Node1(3);
//        head.next.next.next.next = new Node1(6);
//
//        System.out.println("Original List:");
//        printList(head);
//
//        head = segregateEvenAndOddNodes(head);
//
//        System.out.println("Modified List (Even nodes first, preserving order):");
//        printList(head);
//    }
//}