package DSA.ARRAYS.MATRIX;

public class DiagonalSum {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = arr.length;
        int primary = 0;
        int secondary = 0;

        for (int i = 0; i < n; i++) {
            primary += arr[i][i];
            secondary += arr[i][n - i - 1];
        }

        System.out.println("Primary Diagonal Sum = " + primary);
        System.out.println("Secondary Diagonal Sum = " + secondary);
    }
}
