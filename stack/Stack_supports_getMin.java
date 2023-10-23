package stack;
import java.util.Stack;
public class Stack_supports_getMin {
    Stack<Integer> ms=new Stack<>();
    Stack<Integer> as=new Stack<>();
     void push(int x){
        if(ms.isEmpty() && as.isEmpty()) {
            ms.push(x);
            as.push(x);
        }
        else {
            ms.push(x);
            if(as.peek()>=ms.peek())
                as.push(x);
        }
    }
    void pop(){
         if(ms.isEmpty() && as.isEmpty())
             return;
         else{
             if(ms.peek()==as.peek())
                 as.pop();
             ms.pop();
         }
    }
    void getMin(){
        System.out.println(as.peek());
    }
    public static void main(String[] args) {
        Stack_supports_getMin s=new Stack_supports_getMin();
        s.push(5);
        s.push(10);
        s.push(20);
        s.getMin();
        s.push(2);
        s.push(6);
        s.push(4);
        s.getMin();
        s.pop();
        s.pop();
        s.pop();
        s.getMin();
        s.push(2);
        s.getMin();
    }
}