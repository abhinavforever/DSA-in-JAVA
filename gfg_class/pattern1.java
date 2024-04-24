package gfg_class;

public class pattern1 {
    public static void main(String[] args) {
        int n=100;
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                System.out.print(1+Math.max(Math.abs(i-(n-1)),Math.abs(j-(n-1)))+" ");
            }
            System.out.println();
        }
    }
}
