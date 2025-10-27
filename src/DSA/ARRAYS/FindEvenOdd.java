package DSA.ARRAYS;

public class FindEvenOdd {
    public static void main(String [] args) {
        int [] array = { 12,3,4,5,6,7,8 ,6 , 4 };
        int even = 0;
        int odd = 0;
        for ( int i = 0 ; i < array.length ; i++ )
            if ( array[i] % 2 == 0){
                even ++;
                System.out.println("Even Numbers :"+ array[i] );
                System.out.println("The index is :" + i);
            }
            else {
                odd++;
                System.out.println("Odd Numbers :" + array[i]  );
                System.out.println("The index is :" + i);

            }
        }

    }
