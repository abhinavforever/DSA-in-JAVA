package Linked_List.Linked_List_singly;


public class traversing_singly_ll {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
//        head.next.next.next.next=head.next;
        printList(head);
        head=swapkthnode(head,4,2);
        printList(head);

    }
    static Node swapkthnode(Node head, int num, int k)
    {
        // your code here
        if(k>num){
            return head;
        }
        int size=num;
        Node curr=head;

        for(int i=0;i<k-1;i++){
            curr=curr.next;
        }
        Node begin=curr;

        curr=head;
        for(int i=0;i<size-k;i++){
            curr=curr.next;
        }
        Node end=curr;

        int temp=begin.data;
        begin.data=end.data;
        end.data=temp;

        return head;
    }
    static void printList(Node head){
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}