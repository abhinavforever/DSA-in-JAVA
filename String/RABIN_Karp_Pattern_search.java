package String;

import java.util.Scanner;

public class RABIN_Karp_Pattern_search {
    static void RbkSearch(String pat,String txt){
        int m=pat.length(), n=txt.length();
        int h=1;
        int q=23;
        int d=26;
        for (int i = 1; i <= m-1; i++) {
            h=(h*d)%q;
        }
        int p=0,t=0;
        //compute hash values of pat and 1st window of txt i.e. t0
        for (int i = 0; i < m; i++) {
            p=(p*d+pat.charAt(i))%q;
            t=(t*d+txt.charAt(i))%q;
        }
        for (int i = 0; i <= n-m ; i++) {
            if(p==t){
                //check for spurious hit
                boolean flag=true;
                for (int j = 0; j < m; j++) {
                    if(txt.charAt(i+j)!=pat.charAt(j)){
                        flag=false;
                        break;
                    }
                }
                if (flag==true){
                    System.out.print(i+" ");
                }
            }
            if(i<n-m){
                t=(d*(t-txt.charAt(i)*h)+txt.charAt(i+m))%q;
                if(t<0)
                    t=t+q;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string:");
        String txt=sc.nextLine();
        System.out.println("enter the pattern to be searched:");
        String pat=sc.nextLine();
        System.out.println("pattern is present in the string at the following position:");
        RbkSearch(pat,txt);
    }
}