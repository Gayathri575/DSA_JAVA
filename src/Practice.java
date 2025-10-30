public class Practice {
    public static void main(String [] args){
        int arr [] [] ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("Row -wise Print");
        for ( int i = 0 ; i < arr.length ; i ++){
            for ( int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Column - wise Print");
        for (int j = 0 ; j < arr[0].length ; j++){
            for (int i = 0 ; i < arr.length ; i ++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}