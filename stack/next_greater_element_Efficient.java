package stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
public class next_greater_element_Efficient {
    static ArrayList<Integer> nextGreater(int arr[],int n) {
        ArrayList<Integer> a=new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        s.push(arr[n-1]);
        a.add(-1);
        for (int i=n-2;i>=0;i--){
            while (s.empty()==false && s.peek()<=arr[i])
                s.pop();
            int nextGr=s.isEmpty()?-1:s.peek();
            a.add(nextGr);
            s.push(arr[i]);
        }
        Collections.reverse(a);
        return a;
    }
    public static void main(String[] args) {
        int arr[]={5,15,10,8,6,12,9,18};
        ArrayList<Integer> a=nextGreater(arr,arr.length);
        System.out.println(a);
    }
}