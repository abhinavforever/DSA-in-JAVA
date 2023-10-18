package Linked_List.Linked_list_problems;
class Node1{
    int data;
    Node1 next;
    Node1 random;
    Node1(int x)
    {
        data=x;
        next=null;
        random=null;
    }
}
public class clone_a_ll_having_random_pointers {
    static Node1 clone(Node1 head){
        Node1 curr=head;
        for( curr=head;curr!=null;){
            Node1 next=curr.next;
            curr.next=new Node1(curr.data);
            curr.next.next=next;
            curr=next;
        }
        for(curr=head;curr!=null;curr=curr.next.next){
            curr.next.random=(curr.random!=null)?(curr.random.next):null;
        }
        // Step 3: Separate the original and cloned lists
        curr = head;
        Node1 clonedHead = head.next;
        Node1 clonedCurr = clonedHead;

        while (curr != null) {
            curr.next = curr.next.next;
            curr = curr.next;
            if (clonedCurr.next != null) {
                clonedCurr.next = clonedCurr.next.next;
                clonedCurr = clonedCurr.next;
            }
        }
        //let us check the random pointers of cloned list
        System.out.println(clonedHead.next.random.data);
        //above statement should print 15
        System.out.println(clonedHead.next.next.random.data);
        //above statement should print 10
        System.out.println("cloned ll :");
        return clonedHead;

    }
    public static void main(String[] args) {
        Node1 head=new Node1(10);
        head.next=new Node1(5);
        head.next.next=new Node1(20);
        head.next.next.next=new Node1(15);
        head.next.next.next.next=new Node1(20);

        head.random=head.next.next;
        head.next.random=head.next.next.next;
        head.next.next.random=head;
        head.next.next.next.random=head.next.next;
        head.next.next.next.next.random=head.next.next.next;
        
//        head.next.next.next.next.next=new Node1(60);

        Print(head);
        System.out.println();
        head=clone(head);
        Print(head);

    }
    static void Print(Node1 head) {
        Node1 cur = head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }

    }
}