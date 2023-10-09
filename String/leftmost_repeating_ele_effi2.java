package String;

import java.util.Scanner;
public class leftmost_repeating_ele_effi2 {
    static final int CHAR=256;
    static int leftmost(String str){
        boolean visited[]=new boolean[CHAR];
        int res=-1;
        for (int i = str.length()-1; i >=0 ; i--) {
            if(visited[str.charAt(i)])
                res=i;
            else
                visited[str.charAt(i)]=true;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(leftmost(str));
    }
}