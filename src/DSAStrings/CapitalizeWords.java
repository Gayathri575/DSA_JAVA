package DSAStrings;

public class CapitalizeWords {
    public static void main(String[] args) {
        String str = "java full stack development";
        String[] words = str.split(" "); // split the string into words
        String result = "";

        for (String word : words) {
            result += word.substring(0,1).toUpperCase() + word.substring(1) + " ";
        }

        System.out.println("After Capitalizing: " + result.trim());
    }
}
