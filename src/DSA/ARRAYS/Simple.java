package DSA.ARRAYS;

public class Simple {
    public static void main(String [] args){
        int arr [] = {1,2,3,4,5,6,7,8};
        int Sum = 0;
        int Start = 0;
        int End = arr.length - 1 ;
        int Min = arr[0];
        int Max = arr[0];


        while ( Start < End){
            int temp = arr[Start];
            arr[Start] = arr[End];
            arr[End] = temp ;

            Start++;
            End--;
        }
        System.out.println("The Reversed Array is :");
        for(int i = 0 ; i < arr.length ; i++){
            Sum += arr[i];
            if(arr[i] > Max){
                Max = arr[i];
            }
            if(arr[i] < Min){
                Min = arr[i];
            }
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\nthe Minimum is :" + Min);
        System.out.println("the Maximum is :" + Max);
        System.out.println("the Sum is :" + Sum);
    }

}
