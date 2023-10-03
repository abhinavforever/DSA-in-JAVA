package Sorting;

public class min_difference_Naive {
    static int getMinDiff(int arr[],int n){
        int res=Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                res=Math.min(res,Math.abs(arr[i]-arr[j]));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={5,3,8,10,6};
        int min=getMinDiff(arr, arr.length);
        System.out.println(min);
    }
}