package Linked_List.Linked_list_problems;

public class Intersection_Point_of2_LL {
    static int intersect(Node head1,Node head2){
        Node curr1=head1,curr2=head2;
        int c1=0,c2=0;
        for (curr1=head1;curr1!=null;curr1=curr1.next){
          c1++;
        }
        for (curr2=head2;curr2!=null;curr2=curr2.next){
            c2++;
        }
        int abs=Math.abs(c1-c2);
        curr1=head1;
        curr2=head2;
        if(c1>c2) {
            for (int i = 0; i < abs; i++) {
                curr1 = curr1.next;
            }
        }
        else {
            for (int i = 0; i < abs; i++) {
                curr2=curr2.next;
            }
        }
        while (curr1!=null && curr2!=null){
            if(curr1==curr2)
                return (curr1.data);
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return -1;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head.next.next.next.next.next=new Node(60);

        Node head2=new Node(1);
        head2.next=new Node(2);
        head2.next.next= head.next.next;

        Print(head);
        System.out.println();
        Print(head2);
        System.out.println();
        int data=intersect(head,head2);
        System.out.println(data);
    }
    static void Print(Node head) {
        Node cur = head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }

    }
}