package Linked_List.Linked_list_problems;

public class Detect_loop_using_Floyds_Cycle_detection {

    static boolean isLoop(Node head){
        Node slow_p=head,fast_p=head;
        while (fast_p!=null && fast_p.next!=null){
            slow_p=slow_p.next;
            fast_p=fast_p.next.next;//i.e. why fast_p.next!=null in condition to prevent NullException error
            if(slow_p==fast_p)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = head.next.next;
        //30 is the first node of the loop, 50's next is 30
//        Print(head); infinite loop
        boolean hasLoop=isLoop(head);
        if(hasLoop){
            System.out.println("Detected a loop in the ll");
        }
        else {
            System.out.println("Didn't Detect a loop in the ll");

        }
    }
    static void Print(Node head) {
        Node cur = head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }

    }
}