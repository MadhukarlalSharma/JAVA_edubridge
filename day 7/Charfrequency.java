
//  Day 7  9th Question  Character frequency in alphabetical order

public class CharFrequency {
    public static void main(String[] args) {
        String word = "programming";
        int[] count = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            }
        }

        System.out.println("Letter frequencies:");
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char) ('a' + i) + " = " + count[i]);
                if (count[i] > max) {
                    max = count[i];
                }
            }
        }

        System.out.println();
        System.out.println("Most frequent (" + max + " times):");
        for (int i = 0; i < 26; i++) {
            if (count[i] == max) {
                System.out.println((char) ('a' + i));
            }
        }
    }
}
