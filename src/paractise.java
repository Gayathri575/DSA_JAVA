public class paractise {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int Min = arr[0];
        int Max = arr[0];
        int Sum = 0;
        int Start = 0;
        int End = arr.length - 1;

        // Reverse the array
        while (Start < End) {
            int temp = arr[Start];
            arr[Start] = arr[End];
            arr[End] = temp;
            Start++;
            End--;
        }

        System.out.println("The Reversed Elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

            Sum += arr[i];
            if (arr[i] > Max) {
                Max = arr[i];
            }
            if (arr[i] < Min) {
                Min = arr[i]; // 🔥 corrected
            }
        }

        System.out.println("\nThe Maximum value is: " + Max);
        System.out.println("The Minimum value is: " + Min);
        System.out.println("The Sum of Given Elements is: " + Sum);
    }
}
