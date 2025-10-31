package DSAStrings;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "Gayathri";
        str = str.toLowerCase();

        int[] count = new int[256]; // array for all ASCII chars

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        System.out.println("Character Frequencies:");
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                System.out.println((char) i + " → " + count[i]);
            }
        }
    }
}
