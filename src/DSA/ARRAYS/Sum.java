package DSA.ARRAYS;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        int[] sums = {1, 2, 3, 45};

        for (int i = 0; i < sums.length; i++) {
            sum += sums[i];
        }
        System.out.println("The sum is :" + sum);

    }
}
