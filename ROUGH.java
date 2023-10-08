import java.util.Arrays;

public class ROUGH {
    static int[] insert(int arr[],int pos,int cap,int n,int x){
        if(n==cap){
            return arr;
        }
        int idx=pos-1;
        for (int i = n-1; i >=idx ; i--) {
            arr[i+1]=arr[i];
        }
        arr[idx]=x;
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,0};
//        int cap=6;
//        int arr[]=new int [cap];
//        for (int i = 0; i < 5; i++) {
//            arr[i]=i+1;
//        }
        insert(arr,2, arr.length, arr.length-1,-1);
        System.out.println(Arrays.toString(arr));
    }
}