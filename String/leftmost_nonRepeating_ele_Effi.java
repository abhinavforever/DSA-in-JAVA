package String;
import java.util.Arrays;
import java.util.Scanner;
public class leftmost_nonRepeating_ele_Effi {
    static final int CHAR=256;
    static int leftmost(String str){
        int count[]=new int[CHAR];
        Arrays.fill(count,-1);
        for (int i = 0; i < str.length(); i++) {
            if(count[str.charAt(i)]==-1)
                count[str.charAt(i)]=i;
            else
                count[str.charAt(i)]=-2;
        }
        int res=Integer.MAX_VALUE;
        for (int i = 0; i < CHAR; i++) {
            if(count[i]>=0)
                res=Math.min(res,count[i]);
        }
        return (res==Integer.MAX_VALUE)?-1:res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(leftmost(str));
    }
}