package Sorting;

import java.util.Arrays;

public class QuickSort_using_HoarePartition {
    static void qsort(int arr[],int l,int h){
        if(l<h){
            int p=hpartition(arr,l,h);
            qsort(arr,l,p);
            qsort(arr,p+1,h);
        }
    }
    static int hpartition(int arr[],int l,int h){
        int pivot=arr[l];
        int i=l-1;
        int j=h+1;
        while (true){
            do{
                i++;
            }while (arr[i]<pivot);
            do{
                j--;
            }while (arr[j]>pivot);
            if(i>=j){
                return j;
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

    public static void main(String[] args) {
        int arr[]={8,4,7,9,3,10,5};
        qsort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
