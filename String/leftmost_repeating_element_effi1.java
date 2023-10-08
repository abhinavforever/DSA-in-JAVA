package String;
import java.util.Arrays;
import java.util.Scanner;

public class leftmost_repeating_element_effi1 {
    static final int CHAR=256;
    static int leftmost(String str){
        int fIndex[]=new int[CHAR];
        Arrays.fill(fIndex,-1);
        int res=Integer.MAX_VALUE;
        for (int i = 0; i < str.length() ; i++) {
            int fi=fIndex[str.charAt(i)];
            if(fi==-1)
                fIndex[str.charAt(i)]=i;
            else
                res=Math.min(res,fi);
        }
        return (res==Integer.MAX_VALUE)?-1:res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(leftmost(str));
    }
}