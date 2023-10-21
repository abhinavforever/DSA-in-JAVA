package stack;
import javax.lang.model.type.MirroredTypeException;
import java.util.Stack;
public class Stock_span_problem_Efficient {
    static void printSpan(int arr[],int n){
        Stack<Integer> s = new Stack<Integer>();
        s.push(0);
//        System.out.println(1);
        for (int i=1;i<n;i++){
            while (s.isEmpty()==false && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            int span=s.isEmpty()?i+1:i-s.peek();
            System.out.print(span+" ");
            s.push(i);
        }

    }
    public static void main(String[] args) {
        int arr[]={18,12,13,14,11,16};
        printSpan(arr,arr.length);
    }
}