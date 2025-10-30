package DSA.ARRAYS.MATRIX;

public class SumRowColumn {
    public static void main(String [] args){
        int arr [] [] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n = arr.length ;
        int o = arr[0].length ;
        for ( int i = 0 ; i < n ; i++){
            int rowSum = 0;
            for ( int j = 0 ; j < o ; j++){
                rowSum += arr[i][j];
            }
            System.out.println("Sum of Row " + (i + 1) + " = " + rowSum);
        }
        for ( int j = 0 ; j < o ; j++){
            int columSum = 0 ;
            for(int i = 0 ; i < n ; i++){
                columSum +=arr[j][i];
            }
            System.out.println("Sum of Column " + (j + 1) + " = " + columSum);
        }
    }
}
