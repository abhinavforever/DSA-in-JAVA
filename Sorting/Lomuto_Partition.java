package Sorting;
import java.util.Arrays;
public class Lomuto_Partition {
    static int lpartition(int arr[],int l,int h){
        int pivot=arr[h];
        int i=l-1;
        for (int j = l; j <=h-1 ; j++) {
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return (i+1);
    }

    public static void main(String[] args) {
        int arr[]={10,80,30,90,40,50,70};
        int l=0,h=arr.length-1;
        int pivot=lpartition(arr,l,h);
        System.out.println(Arrays.toString(arr));
        System.out.println("Position of pivot = "+pivot);
    }
}
