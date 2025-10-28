package DSA.ARRAYS;

public class evenSwap {
    public static void main(String [] args){
        int arr [] = {1,2,3,4,5,6,6,7,7,8,98,776,55,332,100};
        int Start = 0;
        int End = arr.length-1;

        while ( Start < End){
            if ( arr[Start] % 2 != 0){
                Start ++ ;
            }
            else if ( arr[End] % 2 != 0){
                End -- ;
            }
            else {
                int temp = arr[Start];
                arr[Start] = arr[End];
                arr[End] = temp ;
                Start ++ ;
                End -- ;
            }
        }
        System.out.println("After Swapping The place of Even Numbers :");
        for ( int num : arr){
            System.out.print(num + " ");
        }
    }

}
