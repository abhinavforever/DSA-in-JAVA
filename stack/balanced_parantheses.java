package stack;

import java.util.Scanner;
import java.util.Stack;
class Node1{
    char data;
    Node1 next;
    Node1(char d){
        data=d;
        next=null;
    }
}
class mystack{
    Node1 head;
    int sz;
    mystack(){
        head=null;
        sz=0;
    }
    int size(){
        return sz;
    }
    boolean isEmpty(){
        return (head==null);
    }
    void push(char x){
        Node1 temp=new Node1(x);
        temp.next=head;
        head=temp;
        sz++;
    }
    char pop(){
        if(head==null)
            return '_';
        char res=head.data;
        head=head.next;
        sz--;
        return res;
    }
    char peek() {
        if (head == null)
            return '_';
        return head.data;
    }
}
public class b {

    static boolean isBalanced(String str){
        mystack s=new mystack();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[')
                s.push(str.charAt(i));
            else {
                if(s.isEmpty())
                    return false;
                else if(matching(s.peek(),str.charAt(i))){
                    return false;
                }
                else
                    s.pop();
            }
        }
        return (s.isEmpty());
    }
    static boolean matching(char a,char b){
        return ((a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']'));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        System.out.println("string is balanced(true) or not(false) : ");
        isBalanced(s);
    }
}