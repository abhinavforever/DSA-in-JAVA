package stack;

import java.util.Stack;

public class getMin_Oof1_Space {
    Stack<Integer> s=new Stack<>();
    int min;
    int t;
    int peek(){
            t = s.peek();
            return (t <= 0) ? min : t;
    }
    void push(int x){
        if(s.isEmpty()){
            min=peek();
            s.push(x);
        } else if (x<=min) {
            s.push(x-min);
            min=x;
        }
        else
            s.push(x);
    }
    int pop(){
        int t=s.pop();
        if(t<=0){
            int res=min;
            min=min-t;
            return res;
        }
        else
            return t;
    }
    void getMin(){
        System.out.println(min);
    }

    public static void main(String[] args) {
        getMin_Oof1_Space s=new getMin_Oof1_Space();
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