package Deque;

public class Maximum_ofAll_subarrays_ofSizek_Naive {
    static void printMax(int arr[],int n,int k){
        for(int i=0;i<n-k+1;i++){
            int mx=arr[i];
            for(int j=i+1;j<i+k;j++){
                mx=Math.max(arr[j],mx);
            }
            System.out.println(mx);
        }
    }

    public static void main(String[] args) {
        int a[]={10,8,5,12,15,7,6};
        printMax(a,a.length,3);
    }
}