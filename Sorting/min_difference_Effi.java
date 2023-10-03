package Sorting;

import java.util.Arrays;

public class min_difference_Effi {
    static int getMinDiff(int arr[],int n){
        Arrays.sort(arr);
        int res=Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            res=Math.min(res,arr[i]-arr[i-1]);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={10,8,1,4};
        System.out.println(getMinDiff(arr, arr.length));
    }
}