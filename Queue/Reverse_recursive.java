package Queue;
import java.util.ArrayDeque;
import java.util.Queue;
public class Reverse_recursive {
    static void reverse(Queue<Integer> q){
        if(q.isEmpty())
            return;
        int x=q.peek();
        q.poll();
        reverse(q);
        q.offer(x);
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