package Sorting;

import java.util.Arrays;

public class Counting_Sort_NAIVE {
    static void countSort(int arr[],int n,int k){
        int count[]=new int[k];
        for (int i = 0; i < k; i++) {
            count[i]=0;
        }
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        int index=0;
        for (int i = 0; i < k; i++) { //traverse through count array
            for (int j = 0; j < count[i]; j++) {
                arr[index]=i;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,4,4,1,0,1};
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        countSort(arr, arr.length,max+1);
        System.out.println(Arrays.toString(arr));
    }
}