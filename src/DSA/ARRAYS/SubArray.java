package DSA.ARRAYS;

public class SubArray {
    public static void main(String [] args){
        int arr []  = {1,0,3,4,5,6,7} ;
        int prefix [] = new int [arr.length] ;

        prefix[0] = arr[0];
        for(int i = 1 ; i < arr.length ; i ++){
            prefix [i] = prefix[i - 1] + arr[i] ;
        }
        System.out.println("Sub Array :");

        int L = 0 ;
        int R = 4 ;
        int Sub ;

        if ( L == 0){
            Sub = prefix[R] ;
        }
        else {
            Sub = prefix [R] - prefix [L - 1] ;
        }
        for (int num : prefix ) {
            System.out.print(num + " ");
        }
        System.out.println("\n\nSubarray from index " + L + " to " + R + ":");

        System.out.println("Subarray Sum = " + Sub);
    }
}
