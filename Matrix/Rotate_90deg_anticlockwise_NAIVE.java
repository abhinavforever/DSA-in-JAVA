package Matrix;

import java.util.Arrays;

public class Rotate_90deg_anticlockwise_NAIVE {
    static void rotate90(int mat[][]){
        int n=mat.length;//square matrix
        int temp[][]=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                temp[n-1-j][i]=mat[i][j];
                //last column first row banjata hai aur second last column second row banjata hai. matlab agar column= n-1 then temp mei woh row number n-1-(n-1)=0 hojaega aur agar column number = n-2 hai toh temp mei woh row number n-1-(n-2)=1 hojayega . isliye temp ka row number = n-1-j where j is the column number in mat.
                //we also notice that after rotation first row becomes 1st column,2nd row becomes 2nd column and so on .So that's why the row number and column number of mat and temp are the same i.e. i
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j]=temp[i][j]; //copy elements of temp into mat
            }

        }
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotate90(arr);
        System.out.println(Arrays.deepToString(arr));
    }
}