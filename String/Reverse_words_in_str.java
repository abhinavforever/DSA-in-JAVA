package String;

import java.util.Scanner;

public class Reverse_words_in_str {
    static void reverseWords(char a[],int n){
        int start=0;
        for (int end = 0; end < n; end++) {
            if(a[end]==' ') {
                reverse(a, start, end - 1);
                start=end+1;
            }
        }
        reverse(a,start,n-1);
        reverse(a,0,n-1);
    }
    static void reverse(char a[],int low,int high){
        while(low<=high){
            char temp=a[low];
            a[low]=a[high];
            a[high]=temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char a[]=str.toCharArray();
        reverseWords(a,a.length);
        String ans=new String(a);
        System.out.println(ans);
    }
}