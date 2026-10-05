public class Q7 {

    static String reverse(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return reversed;
    }

    static boolean isPalindrome(String word) {

        String lower = word.toLowerCase();

        return lower.equals(reverse(lower));
    }

    public static void main(String[] args) {

        String word1 = "Madam";
        String word2 = "Java";

        System.out.println(word1 + " -> " + reverse(word1)
                + " -> Palindrome: " + isPalindrome(word1));

        System.out.println(word2 + " -> " + reverse(word2)
                + " -> Palindrome: " + isPalindrome(word2));
    }
}
