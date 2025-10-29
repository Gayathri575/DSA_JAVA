public class paractise {
    public static void main(String [] args) {

        int arr [] = {1,2,3,4,5,67,7};
        int prefix [] = new int [ arr.length] ;

        prefix [0 ] = arr [0] ;

        for ( int i =1 ; i < arr.length ; i ++){
            prefix [i] = prefix[i - 1] + arr[i] ;
        }

        System.out.println("The Prefix Sum is :");

        int L = 1 ;
        int R = 3 ;

        int Sub ;

        if ( L == 0 ){
            Sub = prefix[R] ;
        }
        else {
            Sub = prefix[R] - prefix[L-1] ;
        }
        for (int num : prefix ){
            System.out.print(num + " ");
        }
        System.out.println("\n\n The SubArray sum is :" + Sub) ;
    }
}