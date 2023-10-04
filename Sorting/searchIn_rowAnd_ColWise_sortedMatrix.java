package Sorting;

import java.util.Scanner;

public class searchIn_rowAnd_ColWise_sortedMatrix {
    static void search(int mat[][],int x){
        int r=mat.length,c=mat[0].length;
        int i=0,j=c-1;
        if(x<mat[0][0] || x> mat[r-1][c-1]){
            System.out.println("not found");
            return;
        }
        while (i<r && j>=0){
            if(mat[i][j]==x){
                System.out.println("found at i = "+i+",j = "+j);
                return;
            }
            else if(mat[i][j]>x)
                j--;
            else
                i++;
        }
        System.out.println("not found");
    }

    public static void main(String[] args) {
        int arr[][]={{10,20,30},{15,25,35},{27,29,37}};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter element to be searched: ");
        int x=sc.nextInt();
        search(arr,x);
    }
}