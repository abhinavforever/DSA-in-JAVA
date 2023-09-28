package Sorting;

public class CountInversion {
    public static int countInversion(int arr[],int n){
        int res=0;
        for (int i = 0; i < n-1; i++) {
            for (int j=0;j<n;j++){
                if(arr[i]>arr[j]){
                    res++;
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={2,4,1,3,5};
        System.out.println(countInversion(arr,arr.length));
    }
}
