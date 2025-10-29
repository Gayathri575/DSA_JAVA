package DSA.ARRAYS;

public class KadaneAlgorithm {
    public static void main(String [] args){
        int arr [] = {-2, 3, 4, -1, 5, -12, 6, 1};
        int Max = Integer.MIN_VALUE;
        int CS = 0 ;


        for(int i = 0 ; i < arr.length ; i++) {

            CS += arr[i] ;

            if (CS > Max) {
                Max = CS;
            }
            if (CS < 0) {
                CS = 0;
            }
        }
        System.out.print (Max + " ");
    }
}
