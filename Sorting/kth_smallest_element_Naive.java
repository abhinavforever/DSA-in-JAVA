package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class kth_smallest_element {
    static int kthSmallest(int arr[],int k){
        int n=arr.length;
        Arrays.sort(arr);
        return (arr[k-1]);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,5,30,2};
        System.out.println("Enter the kth smallest number:");
        int k=sc.nextInt();
        System.out.println(kthSmallest(arr,k));
    }
}
