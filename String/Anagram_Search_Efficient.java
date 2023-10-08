package String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Search_Efficient {
    static final int CHAR=256;
    static boolean isPresent(String txt,String pat){
        int ct[]=new int[CHAR];
        int cp[]=new int[CHAR];
        for (int i = 0; i < pat.length() ; i++) {
            ct[txt.charAt(i)]++;
            cp[pat.charAt(i)]++;
        }
        for (int i = pat.length(); i < txt.length(); i++) {
            if(Arrays.equals(ct,cp))
                return true;
            ct[txt.charAt(i)]++;
            ct[txt.charAt(i-pat.length())]--;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String txt=sc.nextLine();
        String pat=sc.nextLine();
        if(isPresent(txt,pat))
            System.out.println("2nd string's anagram is present in 1st string");
        else
            System.out.println("2nd string's anagram is not present in 1st string");
    }
}