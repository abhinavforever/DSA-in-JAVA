package stack;

import java.util.Stack;
public class previous_greater_element_efficient {
    static void printPrevGreaterEffi(int arr[],int n){
        Stack<Integer> s=new Stack<>();
        s.push(arr[0]);
        System.out.print(-1+" ");
        for(int i=1;i<n;i++){
            while (s.isEmpty()==false && s.peek()<=arr[i])
                s.pop();
            int pg=(s.isEmpty())?-1:s.peek();
            System.out.print(pg+" ");
            s.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={20,30,10,5,15};
        printPrevGreaterEffi(arr,arr.length);
    }
}