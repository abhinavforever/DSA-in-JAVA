package Queue;


import java.util.ArrayDeque;
import java.util.Queue;

class Stack1 {
    Queue<Integer> q1=new ArrayDeque<>();
    Queue<Integer> q2=new ArrayDeque<>();
    int top(){
        return q1.peek();
    }
    int size(){
        return q1.size();
    }
    int pop(){
        return q1.poll();
    }
    void push(int x){
        while (q1.isEmpty()==false){
            q2.offer(q1.poll());
        }
        q1.offer(x);
        while (q2.isEmpty()==false){
            q1.offer(q2.poll());
        }
    }
}
public class Implement_stack_using_queue {
    public static void main(String[] args) {
        Stack1 s=new Stack1();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());//the last pushed element is also the first one that gets popped i.e. LIFO order is maintained , hence we have successfully implemented stack using queue
        s.push(4);
        System.out.println(s.pop());
        System.out.println(s.size());
    }
}