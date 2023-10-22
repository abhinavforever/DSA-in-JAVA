package stack;
public class previous_greater_element_Naive {
    static void printPrevGreater(int arr[],int n){
        for(int i=0;i<n;i++){
            int j;
            for( j=i-1;j>=0;j--){
                if(arr[j]>arr[i]){
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
            if(j==-1)
                System.out.print(-1+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={20,30,10,5,15};
        printPrevGreater(arr,arr.length);
    }
}