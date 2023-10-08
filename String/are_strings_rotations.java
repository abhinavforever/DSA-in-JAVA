package String;

import java.util.Scanner;

public class are_strings_rotations {
    static boolean areRotations(String s1,String s2){
        if(s1.length()!=s2.length())
            return false;
        return ((s1 + s1).contains(s2));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1= sc.nextLine();
        String s2=sc.nextLine();
        boolean b=areRotations(s1,s2);
        if (b)
            System.out.println("Yes! strings are rotations of each other");
        else
            System.out.println("No! strings are not rotations of each other");
    }
}