package String;

import java.util.Scanner;

public class leftmost_nonRepeating_ele_Better {
    static final int CHAR=256;
    static int leftmost(String str){
        int count[]=new int[CHAR];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if(count[str.charAt(i)]==1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(leftmost(str));
    }
}