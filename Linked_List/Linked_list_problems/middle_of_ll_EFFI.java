package Linked_List.Linked_list_problems;

public class middle_of_ll_EFFI {
    static void printMiddle(Node head){
        if(head==null)
            return;
        Node slow=head,fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        Node temp3=new Node(40);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        Print(head);
        //if there are two middle elements then print the second middle element
        System.out.println("\nmiddle Node(s) =");
        printMiddle(head);
    }
    static void Print(Node head) {
        Node cur = head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }

    }
}