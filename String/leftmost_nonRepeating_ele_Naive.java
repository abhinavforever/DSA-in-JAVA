package String;

import java.util.Scanner;
public class leftmost_nonRepeating_ele_Naive {
    static int leftmost(String str){
        boolean flag=false;
        for (int i = 0; i < str.length(); i++) {
            flag=false;
            for (int j = 0; j < str.length(); j++) {
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    flag=true;//repeating ele so break
                    break;
                }
            }
            if(flag==false){
                return i;//first non repeating element
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(leftmost(str));
    }
}