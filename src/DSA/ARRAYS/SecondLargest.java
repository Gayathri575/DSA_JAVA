package DSA.ARRAYS;

public class SecondLargest {
    public static void main(String [] args) {
        int arr[] = {12, 23, 45, 6, 7, 8, 90};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] >arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int number : arr) {
            System.out.println(number+ " ");
        }
        System.out.println("the second Smallest num is :"+arr[arr.length-2]);
    }

}
