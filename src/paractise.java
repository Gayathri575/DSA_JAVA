public class paractise {
    public static void main (String [] args){
        int arr [] = {12,23,45,23,24,90,5};
        int Start = 0 ;
        int end = arr.length - 1;
        while ( Start < end){
            int temp = arr[Start];
            arr[Start] = arr[end];
            arr[end] = temp ;

            Start ++;
            end --;
        }
        for(int i = 0 ; i <arr.length ; i++)
        System.out.print(arr[i] + " ");
    }

}