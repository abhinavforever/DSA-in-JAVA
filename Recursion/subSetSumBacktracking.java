package Recursion;

public class subSetSumBacktracking {
    //   TIME COMPLEXITY = 2^N
//     SPACE COMPLEXITY = O(n)
    public static int[] arr = {2,5,7,9,3,1,13};
    public static boolean rec(int target,int n) {
        if (target == 0) {
            return true;
        }
        if (target < 0) {
            return false;
        }
        if (n == 0) {
            return false;
        }
        return rec(target - arr[n - 1], n - 1) | rec(target, n - 1);

    }
    public static void main(String[] args) {


        System.out.println(rec(11,7));
    }
}