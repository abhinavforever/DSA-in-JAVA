package Sorting;

import java.util.Arrays;

public class Counting_Sort_OPTIMAL {
    static void countSort(int arr[],int n,int k){
        int count[]=new int [k];
        for (int i = 0; i < k; i++) {
            count[i]=0;
        }
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        //for every i in count we will now store the number of elements which are less than or equal to i .
        for (int i = 1; i < k; i++) {
            count[i]=count[i-1]+count[i];
        }
        int output[]=new int [n];
        for (int i = n-1; i >=0 ; i--) {
            output[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i]=output[i];
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