import java.util.Arrays ;
public class paractise {
    public static void main(String [] args){
        int arr [] = {11,22,32,1,2,11,12,32,22};

        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length-1 ; i++){
            System.out.println("After Sorted  :" + arr[i]);
            if ( arr[i] % 2 != 0){
            System.out.print(arr[i] + " ");
        }
        }
        System.out.print(arr[arr.length-1]);
    }
}