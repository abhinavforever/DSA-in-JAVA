package Tree;
import java.util.Scanner;
public class Anagram_Search_Naive {
    static boolean isPresent(String txt,String pat){
        int n=txt.length();
        int m=pat.length();

        for (int i = 0; i <= n-m ; i++) {
            if(areAnagram(pat,txt,i))
                return true;
        }
        return false;
    }
    static final int CHAR=256;
    static boolean areAnagram(String pat,String txt, int i){
        int count[]=new int[CHAR];
        for (int j = 0; j < pat.length(); j++) {
            count[pat.charAt(j)]++;
            count[txt.charAt(i+j)]--;
        }
        for (int j = 0; j < CHAR; j++) {
            if(count[j]!=0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String txt=sc.nextLine();
        String pat=sc.nextLine();
        if (isPresent(txt,pat))
            System.out.println("2nd string's anagram is present in 1st string");
        else
            System.out.println("2nd string's anagram is not present in 1st string");
    }
}