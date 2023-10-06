package String;

import java.util.Scanner;

public class palindrome_efficient {
    static boolean isPal(String str){
        int begin=0;
        int end=str.length()-1;
        while (begin<end){
            if(str.charAt(begin)!=str.charAt(end))
                return false;
            begin++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any string:");
        String str=sc.next();
        boolean b=isPal(str);
        if(b==true){
            System.out.println("is Palindrome");
        }
        else
            System.out.println("not palindrome");
    }
}