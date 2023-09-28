package Sorting;
//EFFICIENT APPROACH
public class CountInversionEffi {
    static int countInv(int arr[],int l,int r){
        int res=0;
        if(l<r){
            int m=l+(r-l)/2;
            res+=countInv(arr,l,m);
            res+=countInv(arr,m+1,r);
            res+=countandMerge(arr,l,m,r);
        }
    return res;}
    static int countandMerge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[m + 1 + i];
        }
        int res = 0, i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
                res += (n1 - i); // Increment the inversion count
            }
            k++;
        }
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
        return res;
    }
//{2,5,8,11,3,6,9,13} = 6
    public static void main(String[] args) {
        int arr[]={2,5,8,11,3,6,9,13};
        int l=0,r=arr.length-1;
        System.out.println(countInv(arr,l,r));
    }
}
