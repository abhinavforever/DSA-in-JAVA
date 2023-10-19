package stack;

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
public class implement_two_stacks_inArray {
    int cap;
    int arr[]=new int[cap];
    int top1,top2;

    implement_two_stacks_inArray(int n){
        cap=n;
        top1=-1;
        top2=cap;
        arr=new int[n];
    }
    void push1(int x){
        if(top1 < top2-1) {
            top1++;
            arr[top1]=x;
        }
    }
    void push2(int x){
        if(top1<top2-1){
            top2--;
            arr[top2]=x;
        }
    }
    int pop1(){
        if(top1>=0){
            int x=arr[top1];
            top1--;
            return x;
        }
        else {
            return Integer.MAX_VALUE;
        }
    }
    int pop2(){
        if(top2<cap){
            int x=arr[top2];
            top2++;
            return x;
        }
        else {
            return Integer.MAX_VALUE;
        }
    }

    public static void main(String[] args) {
        implement_two_stacks_inArray arr=new implement_two_stacks_inArray(5);
        arr.push1(1);
        arr.push1(2);
        arr.push2(4);
        arr.push2(3);
        System.out.println(arr.pop1());
        System.out.println(arr.pop2());
    }
}