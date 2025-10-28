package DSA.ARRAYS;

public class FindingMinMaxSum {
    public static void main(String [] args){
        int arr [] = {1,2,3,4,5};
        int Max = arr[0];
        int Min = arr[0];
        int Sum = 0 ;

        for(int i = 0 ; i < arr.length ; i++){
            Sum += arr[i] ;
            if ( arr[i] > Max ){
                Max = arr[i] ;
            }
            if ( arr[i] < Min ){
                Min = arr[i] ;
            }
            System.out.println("The Max Number is :" + Max);
            System.out.println("The Min Number is :" + Min);
        }
                System.out.println("The Sum is :"+Sum);
    }
}
