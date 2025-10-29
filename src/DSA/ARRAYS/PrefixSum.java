package DSA.ARRAYS;

public class PrefixSum {
    public static void main(String [] args){
        int arr [] = {12,34,5,6,78,90};
        int prefix [] = new int [arr.length];
        prefix[0] = arr[0] ;
        for(int i = 1 ; i < arr.length ; i ++){
            prefix[i] = prefix[i - 1] + arr[ i ] ;
        }
        System.out.println("Prefix Sums :");
        for (int num : prefix){
            System.out.print(num + " ");
        }
    }
}
