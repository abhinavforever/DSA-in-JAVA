package Sorting;

import java.util.Arrays;
public class SelectionSort {
    public static int[] selectSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_ind=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_ind]) {
                    min_ind=j;
                }
            }
            int temp = arr[min_ind];
            arr[min_ind]=arr[i];
            arr[i]=temp;
        }
    return arr;}
    public static void main(String[] args) {
        int arr[]={90,80,90,25}; //{25,80,90,90}
        System.out.println(Arrays.toString(selectSort(arr)));
    }
}
