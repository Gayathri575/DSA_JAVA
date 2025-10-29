package DSA.ARRAYS;

public class FindDuplicate {
    public static void main(String [] args){
        int arr [] = { 1,1 ,22,33,45,5,5,5 ,5,66,7,7};
        for ( int i = 0 ; i < arr.length ; i ++){
            for ( int j = i + 1 ; j < arr.length ; j++){
                if ( arr[j] == arr[i]){
                    System.out.println("The Duplicate Number is :" + arr[j]);
                    break;
                }
            }
        }
    }
}
