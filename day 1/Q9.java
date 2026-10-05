public class Q9 {
    public static void main(String[] args) {

        String str = "programming";

        int[] count = new int[26];

        for (char ch : str.toCharArray()) {
            count[ch - 'a']++;
        }

        int max = 0;

        for (int value : count) {
            if (value > max) {
                max = value;
            }
        }

        System.out.println("Character frequencies:");

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char) ('a' + i)
                        + " = " + count[i]);
            }
        }

        System.out.println("Most frequent:");

        for (int i = 0; i < 26; i++) {
            if (count[i] == max) {
                System.out.println((char) ('a' + i)
                        + " = " + max);
            }
        }
    }
}
