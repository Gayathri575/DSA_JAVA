package DSA.ARRAYS ;
public class MinMax {
    public static void main(String [] args){
        int arr [] = {12,23,45,67,99,10};
       int Max = arr[0];
       int Min = arr[0];
       for(int i = 0 ; i < arr.length ; i ++){
           if ( arr[i] > Max){
               Max =  arr[i];
           }
           if ( arr[i] < Min){
               Min = arr[i];
           }

       }
        System.out.println("The Max from the element is :" + Max);
        System.out.println("The Max from the element is :" + Min);


    }
}