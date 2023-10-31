package Deque;
import java.util.ArrayDeque;
public class ArrayDeque_as_stack_queue_deque {
    public static void main(String[] args) {

        //array deque as stack
        ArrayDeque<Integer> s=new ArrayDeque<>();

        s.push(10);
        s.push(20);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        s.push(40);
        System.out.println(s.peek());
        System.out.println();

        // array deque as queue
        ArrayDeque<Integer> aq=new ArrayDeque<>();

        aq.offer(10);
        aq.offer(20);
        System.out.println(aq.peek());
        System.out.println(aq.poll());
        System.out.println(aq.peek());
        aq.offer(40);
        System.out.println(aq.peek());
        System.out.println();

        // array deque as deque
        ArrayDeque<Integer> ad=new ArrayDeque<>();

        ad.offerFirst(10);
        ad.offerLast(20);
        ad.offerFirst(30);
        ad.offerLast(40);
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        System.out.println(ad.pollFirst());
        System.out.println(ad.peekFirst());
        System.out.println(ad.pollLast());
        System.out.println(ad.peekLast());
    }
}