package Linked_List.Linked_list_problems;
import java.util.ArrayDeque;
import java.util.Deque;
class Node2{
    char data;
    Node2 next;
    Node2(char ch){
        data=ch;
        next=null;
    }
}
public class Palindrome_ll_Naive {
    static boolean isPalindrome(Node2 head){
        Deque<Character> stack=new ArrayDeque<Character>();
        for(Node2 curr=head;curr!=null;curr=curr.next){
            stack.push(curr.data);
        }
        for(Node2 curr=head;curr!=null;curr=curr.next){
            if(stack.pop()!=curr.data)
                return false;
        }
        return true;
    }
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