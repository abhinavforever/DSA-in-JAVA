package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sortarr_with2types_ofEle_NAIVE {
   static void segregatePosNeg(int arr[]){
       int n=arr.length;
       int temp[]=new int[n];
       int i=0;

       for (int j = 0; j < n; j++) {
           if(arr[j]<0){
               temp[i]=arr[j];
               i++;
           }
       }
       for (int j = 0; j < n; j++) {
           if(arr[j]>0){
               temp[i]=arr[j];
               i++;
           }
       }
       for (int j = 0; j < n; j++) {
           arr[j]=temp[j];
       }
   }

    public static void main(String[] args) {
        int arr[]={13,-12,18,-10};
        segregatePosNeg(arr);
        System.out.println(Arrays.toString(arr));
    }
}
