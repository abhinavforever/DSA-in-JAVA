package String;

import java.util.Scanner;

public class is_Subsequence_Recursive {
    static boolean isSubseqRec(String s1,String s2,int n,int m){
        if(m==0)
            return true;
        if(n==0)
            return false;

        if(s1.charAt(n-1)==s2.charAt(m-1))
            return isSubseqRec(s1,s2,n-1,m-1);
        else
            return isSubseqRec(s1,s2,n-1,m);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        boolean b=isSubseqRec(s1,s2,s1.length(),s2.length());
        if (b)
            System.out.println("s2 is subsequence of s1");
        else
            System.out.println("s2 is not subsequence of s1");
    }
}