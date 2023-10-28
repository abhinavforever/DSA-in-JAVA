package Deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Deque_inJava {
    public static void main(String[] args) {
        Deque<Integer> d=new LinkedList<>();
        d.offerFirst(10);
        d.offerLast(20);
        d.offerFirst(5);
        d.offerLast(15);
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
        d.pollFirst();
        d.pollLast();
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
        d.pollFirst();
        d.pollLast();
        System.out.println(d.peekLast());//returns null instead of Exception
        System.out.println(d.peekFirst());//returns null instead of Exception

        //Functions that throw Exception
        d.addFirst(10);
        d.addLast(20);
        d.addFirst(5);
        d.addLast(15);
        System.out.println(d.getFirst());
        System.out.println(d.getLast());

        //Traversing
        Iterator it=d.iterator();
        while (it.hasNext())
            System.out.print(it.next()+" ");
        System.out.println();

        for(int x:d)
            System.out.print(x+" ");
        System.out.println();

        d.removeFirst();
        d.removeLast();
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
        d.removeLast();
        d.removeLast();
        System.out.println(d.getFirst());//throws Exception
    }
}