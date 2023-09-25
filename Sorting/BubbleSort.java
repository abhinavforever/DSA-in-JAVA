package Sorting;

import java.util.*;
public class BubbleSort {
    public static int[] bubbleSort(int []arr){
        int n=arr.length;
        boolean swapped=false;
        for(int i=0;i<n-1;i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                break;}
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{3,5,2,-1};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
