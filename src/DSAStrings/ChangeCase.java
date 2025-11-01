package DSAStrings;

public class ChangeCase {
    public static void main(String[] args) {
        String str = "gaYatHiRI";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else {
                result += ch; // for symbols/spaces
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("Converted String: " + result);
    }

}
