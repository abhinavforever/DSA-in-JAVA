package String;
import java.util.Scanner;
public class is_Anagram_efficient {
    static final int CHAR=256;
    static boolean isAna(String s1,String s2){
        if(s1.length()!=s2.length())
            return  false;
        int count[]=new int [CHAR];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for (int i = 0; i < CHAR; i++) {
            if(count[i]!=0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        boolean b=isAna(s1,s2);
        if (b)
            System.out.println("s2 is anagram of s1");
        else
            System.out.println("s2 is not anagram of s1"); }}