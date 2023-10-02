package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Chocolate_distribution {
    static int mindiff(int arr[],int m){
        int n=arr.length;
        if(m>n){
            return -1;
        }
        Arrays.sort(arr);
        int res=arr[m-1]-arr[0];
        for (int i = 0; (i+m-1) < n; i++) {
            res=Math.min(res,(arr[i+m-1]-arr[i]));
        }
    return res;
    }

    public static void main(String[] args) {
        int arr[]={7,3,2,4,9,12,56};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of children:");
        int m=sc.nextInt();
        System.out.println(mindiff(arr,m));
    }
}
