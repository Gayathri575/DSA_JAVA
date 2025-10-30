package DSA.ARRAYS;

public class Simple {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        int sum = 0;
        int start = 0;
        int end = arr.length - 1;
        int min = arr[0];
        int max = arr[0];

        // Reverse the array
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("The Reversed Array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //  Even numbers
        System.out.println("\n\nThe Even Numbers are:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        //  Odd numbers
        System.out.println("\nThe Odd Numbers are:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }

        //  Find sum, min, max, and second largest
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];

            // Second largest logic
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        //  Print results
        System.out.println("\n\nThe Minimum is: " + min);
        System.out.println("The Maximum is: " + max);
        System.out.println("The Sum is: " + sum);
        System.out.println("The Second Largest is: " + second);
    }
}
