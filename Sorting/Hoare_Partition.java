package Sorting;

import java.util.Arrays;

public class Hoare_Partition {
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
        int arr[]={5,3,8,4,2,7,1,10};
        int left_half_index=hpartition(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println(left_half_index);
    }
}
