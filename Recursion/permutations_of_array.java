package Recursion;

public class permutations_of_array {
    public static void rec(int i,int n, int [] arr,boolean take[],int[]p){
        if(i==n){
            for(int j = 0;j<n;j++){
                System.out.print(p[j]+" ");
            }
            System.out.println();
            return;
        }
        for(int j = 0;j<n;j++){
            if(take[j]==false){
                take[j]=  true;
                p[i] = arr[j];
                rec(i+1,n,arr,take,p);
                take[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        boolean [] take = new boolean[n];
        int[] p = new int[n];
        int[] arr = {1,2,3,4};
        rec(0,n,arr,take,p);
    }
}


