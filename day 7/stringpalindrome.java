//   Day 7  7th Question  Reverse a string and check palindrome

public class StringPalindrome {
    static String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }

    static void check(String word) {
        String reversed = reverse(word);

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println(word + " -> reversed: " + reversed + " -> Palindrome");
        } else {
            System.out.println(word + " -> reversed: " + reversed + " -> Not a Palindrome");
        }
    }

    public static void main(String[] args) {
        check("Madam");
        check("Java");
    }
}