package Recursion;


import java.util.Scanner;

public class Rope_cutting_problem {
    public static int rope(int n, int a, int b, int c){
        if(n==0)
            return 0;
        if(n<0)
            return Integer.MIN_VALUE;
        return Math.max(1+rope(n-a,a,b,c),Math.max(1+rope(n-b,a,b,c),1+rope(n-c,a,b,c)));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        int r=rope(n,a,b,c);
        if(r>=0) {
            System.out.println(r);
        }
        else{
            System.out.println("not possible");
        }
    }
}