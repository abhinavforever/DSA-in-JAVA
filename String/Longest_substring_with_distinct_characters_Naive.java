package String;

import java.util.Scanner;

public class Longest_substring_with_distinct_characters_Naive {
    static boolean areDistinct(String str,int i,int j){
        boolean visited[]=new boolean[256];
        for (int k = i; k <=j; k++) {
            if(visited[str.charAt(k)]==true)
                return false;
            visited[str.charAt(k)]=true;
        }
        return true;
    }
    static int longestDistinct(String str){
        int n=str.length(),res=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(areDistinct(str,i,j))
                    res=Math.max(res,j-i+1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(longestDistinct(str));
    }
}