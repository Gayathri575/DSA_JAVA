package DSA.ARRAYS;

public class Reverse {
    public static void main(String [] args){
        int arr [] = {12,34,56,78,90,2,3,45,67};
        int Start = 0;
        int end = arr.length - 1;

        while ( Start < end)
        {
            int temp = arr[Start];
            arr[Start] = arr[end] ;
            arr[end] = temp ;


            Start ++;
            end --;
        }
        for (int i = 0 ; i < arr.length ; i++)
            System.out.print(arr[i] + " ");
    }
}
