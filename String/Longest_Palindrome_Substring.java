package String;

import java.util.Scanner;

public class Longest_Palindrome_Substring {
     public static String longestPalindrome(String s) {
         int n=s.length();
         if(n==1){
             return s;
         }
         int ind=0;
         int res=Integer.MIN_VALUE;
         for(int i=0;i<n;i++){
             for(int j=i;j<n;j++){
                 String subString=s.substring(i,j+1);
                 if (palindrome(subString)){
                     int temp=res;
                     res=Math.max(res,subString.length());
                     if(res>temp)
                         ind=i;
                 }
             }
         }
         return s.substring(ind,ind+res);
     }
     static boolean palindrome(String str){
         String rev = "";
         boolean ans = false;

         for (int i = str.length() - 1; i >= 0; i--) {
             rev = rev + str.charAt(i);
         }
         if (str.equals(rev)) {
             ans = true;
         }
         return ans;
     }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(longestPalindrome(str));
    }
}