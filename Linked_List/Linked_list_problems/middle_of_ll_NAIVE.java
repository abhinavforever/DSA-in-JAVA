package Linked_List.Linked_list_problems;

public class middle_of_ll_NAIVE {
    static void printMiddle(Node head){
        if(head==null)
            return;
        int count=0;
        Node curr;
        for(curr=head;curr!=null;curr=curr.next){
            count++;
        }
        curr=head;
        for (int i=0;i<count/2;i++){
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
        System.out.println("\nmiddle Node =");
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