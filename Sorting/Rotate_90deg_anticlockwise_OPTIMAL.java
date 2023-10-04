package Sorting;

import java.util.Arrays;

public class Rotate_90deg_anticlockwise_OPTIMAL {
    static void rotate90(int mat[][]){
        int n=mat.length;
        //find transpose first
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j < n; j++) {
                int temp=mat[j][i];
                mat[j][i]=mat[i][j];
                mat[i][j]=temp;
            }
        }
        //ab transpose ke rows ko reverse karo toh rotation by 90 deg anticlockwise hojayega

        for (int i = 0; i < n; i++) {
            int low=0,high=n-1;
            while (low<high){
                int temp=mat[low][i];
                mat[low][i]=mat[high][i];
                mat[high][i]=temp;

                low++;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotate90(arr);
        System.out.println(Arrays.deepToString(arr));
    }
}