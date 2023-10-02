package Sorting;

import java.util.Arrays;

public class Sortarr_with2types_ofEle_Optimal {
    static void segPosNeg(int arr[]){
        int n=arr.length;
        int i=-1;
        int j=n;
        while (true){
            do{
                i++;
            }while (arr[i]<0);
            do{
                j--;
            }while (arr[j]>=0);

            if(i>=j)
                return;

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

    public static void main(String[] args) {
        int arr[]={-12,18,-10,15};
        segPosNeg(arr);
        System.out.println(Arrays.toString(arr));
    }
}
