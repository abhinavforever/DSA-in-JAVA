package stack;

public class Stock_span_problem_Naive {
    static void printSpan(int arr[],int n){
        for(int i=0;i<n;i++){
            int  span=1;
            for(int j=i-1 ; j>=0 && arr[j]<=arr[i];j--)
                span++;
            System.out.print(span+ " ");;
        }
    }

    public static void main(String[] args) {
        int arr[]={18,12,13,14,11,16};
        printSpan(arr,arr.length);
    }
}