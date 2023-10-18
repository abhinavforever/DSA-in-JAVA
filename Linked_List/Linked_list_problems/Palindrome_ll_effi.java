package Linked_List.Linked_list_problems;
public class Palindrome_ll_effi {
    static boolean isPalindrome(Node2 head){
        if(head==null)
            return true;
        Node2 slow=head;
        Node2 fast=head;
        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;}
        Node2 rev=reverse(slow.next);
        Node2 curr=head;
        while (rev!=null){
            if(rev.data!=curr.data)
                return false;
            rev=rev.next;
            curr=curr.next;}
        return true;}
    static Node2 reverse(Node2 head){
        Node2 curr=head;
        Node2 prev=null;
        while (curr!=null){
            Node2 next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;}
        return prev;}//prev is new head
    public static void main(String[] args) {
        Node2 head=new Node2('a');
        head.next=new Node2('b');
        head.next.next=new Node2('c');
        head.next.next.next=new Node2('b');
        head.next.next.next.next=new Node2('a');
        Print(head);
        boolean b=isPalindrome(head);
        if (b)
            System.out.println("\nPalindrome ll");
        else
            System.out.println("\nNot Palindrome ll");
    }
    static void Print(Node2 head) {
        Node2 cur = head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
    }
}