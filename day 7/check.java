//  Day 7  10th Question  Anagram Check

import java.util.Arrays;

public class AnagramCheck {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        char[] x = a.toLowerCase().toCharArray();
        char[] y = b.toLowerCase().toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        return Arrays.equals(x, y);
    }

    public static void main(String[] args) {
        System.out.println("Listen / Silent -> " + isAnagram("Listen", "Silent"));
        System.out.println("Hello / World   -> " + isAnagram("Hello", "World"));
    }
}