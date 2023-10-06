package String;
import java.util.Arrays;
import java.util.Scanner;

public class is_Anagram_Naive {
    static boolean isAna(String s1,String s2){
        if(s1.length()!=s2.length())
            return false;
        char a1[]=s1.toCharArray();
        Arrays.sort(a1);
        s1=new String(a1);

        char a2[]=s2.toCharArray();
        Arrays.sort(a2);
        s2=new String(a2);
        return s1.equals(s2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        boolean b=isAna(s1,s2);
        if (b)
            System.out.println("s2 and s1 are anagrams of each other");
        else
            System.out.println("s2 and s1 are not anagrams of each other");
    }
}