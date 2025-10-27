public class paractise {
    public static void main(String[] args) {
        int arr[] = {12, 23, 45, 24, 90, 5};

        // sort ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {  // swap for ascending
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Ascending Order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nSecond Largest: " + arr[arr.length - 2]);
    }
}
