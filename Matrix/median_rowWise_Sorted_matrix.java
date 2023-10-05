package Matrix;

import java.util.Arrays;

public class median_rowWise_Sorted_matrix {
    static int matMed(int mat[][]){
        int r=mat.length;
        int c=mat[0].length;
        int min=mat[0][0];
        int max=mat[0][c-1];
        for (int i = 1; i < r; i++) {
            if(mat[i][0]<min){
                min=mat[i][0];
            }
            if(mat[i][c-1]>max){
                max=mat[i][c-1];
            }
        }
        int medPos=(r*c+1)/2;
        while (min<max){
            int mid=(min+max)/2,midPos=0;
            //Initialize midPos to 0. This variable will be used to count the number of elements in the matrix that are less than or equal to mid.
            for (int i = 0; i < r; i++) {
                int pos= Arrays.binarySearch(mat[i],mid)+1;
                midPos+=Math.abs(pos);
            }
            //If midPos is less than medPos, it means that the median element must be greater than mid, so we set min = mid + 1 to narrow down the search range to the right half of the current range.
            //If midPos is greater than or equal to medPos, it means that the median element must be less than or equal to mid, so we set max = mid to narrow down the search range to the left half of the current range.

            if(midPos<medPos)
                min=mid+1;
            else
                max=mid;
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[][]={{5,10,20,30,40},{1,2,3,4,6},{11,13,15,17,19}};
        int med=matMed(arr);
        System.out.println("Median element="+med);
    }
}