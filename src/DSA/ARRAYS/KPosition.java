package DSA.ARRAYS;

public class KPosition {
    public static void main(String [] args){
        int arr [] = {1,2,3,4,5,6,7,8};
        int K = 2 ;
        int n = arr.length ;
        int result [] = new int [n] ;

        for ( int i = 0 ; i < K ; i++){
            result[i] = arr[n - K + i] ;
        }
        for ( int i = K ; i < n ; i++){
            result[i] = arr[i - K] ;
        }
        for ( int i = 0 ; i < n ; i++){
            System.out.print(result[i] );
        }
    }
}
