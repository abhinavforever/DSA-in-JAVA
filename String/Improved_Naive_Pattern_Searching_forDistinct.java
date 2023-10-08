package String;
import java.util.Scanner;
public class Improved_Naive_Pattern_Searching_forDistinct {
    static void patSearchDistinct(String txt,String pat){
        int n=txt.length();
        int m=pat.length();
        for (int i = 0; i <=n-m ;) {
            int j;
            for (j = 0; j < m; j++) {
                if(txt.charAt(i+j)!=pat.charAt(j))
                    break;}
            if(j==m)
                System.out.print(i+" ");
            if(j==0)
                i++;
            else
                i=i+j;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String txt=sc.nextLine();
        String pat=sc.nextLine();
        patSearchDistinct(txt,pat);
    }
}