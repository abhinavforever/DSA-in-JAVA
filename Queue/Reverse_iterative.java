package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Reverse_iterative {
    static void reverse (Queue<Integer> q){
        Stack<Integer> s=new Stack<Integer>();
        while (!q.isEmpty()){
            s.push(q.poll());
        }
        while (!s.isEmpty()){
            q.offer(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<Integer>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        System.out.println(q);
        System.out.println("front = "+q.peek());
        reverse(q);
        System.out.println(q);
        System.out.println("front = "+q.peek());
    }
}