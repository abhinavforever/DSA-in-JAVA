package String;

import java.util.Scanner;

public class is_Subsequence_Iterative {
    static boolean isSubseq(String s1,String s2){
        int n=s1.length(),m=s2.length();
        if(n<m)
            return false;
        int j=0;
        for (int i = 0; i < n && j<m; i++) {
            if(s1.charAt(i)==s2.charAt(j))
                j++;
        }
        return (j==m);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st string:");
        String str1=sc.next();
        System.out.println("enter 2nd string:");
        String str2=sc.next();
        boolean b=isSubseq(str1,str2);
        if (b)
            System.out.println("2nd string is a subsequence of 1st string");
        else
            System.out.println("2nd string is not a subsequence of 1st string");
    }
}