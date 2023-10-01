package Sorting;

import java.util.Scanner;

public class kth_Smallest_element_Optimal {
    static int kthSmallest(int arr[],int k){
        int l=0,r=arr.length-1;
        while (l<=r){
            int p=lpartition(arr,l,r);//Lomuto partition
            if(p==k-1)
                return p;
            else if(p>k-1)
                r=p-1;
            else l=p+1;
        }
        return -1;
    }
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
        Scanner sc=new Scanner(System.in);
        int arr[]={10,4,5,8,11,6,26};
        System.out.println("enter the value of k: ");
        int k=sc.nextInt();
        System.out.println(arr[kthSmallest(arr,k)]);
    }
}
