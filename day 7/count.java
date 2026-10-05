//   Day 7  8th Question   Count vowels, consonants, digits and spaces

public class CountChars {
    public static void main(String[] args) {
        String text = "Java 21 is Awesome";

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if (lower == 'a' || lower == 'e' || lower == 'i'
                        || lower == 'o' || lower == 'u') {
                    vowels++;
                } 
                else {
                    consonants++;
                }
            } 
            else if (Character.isDigit(ch)) {
                digits++;
            } 
            else if (ch == ' ') {
                spaces++;
            }
        }

        System.out.println("Vowels     = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Digits     = " + digits);
        System.out.println("Spaces     = " + spaces);
    }
}