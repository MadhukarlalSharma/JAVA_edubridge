public class Q8 {
    public static void main(String[] args) {

        String str = "Java 21 is Awesome";

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        for (char ch : str.toCharArray()) {

            if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            } else if (Character.isLetter(ch)) {

                char c = Character.toLowerCase(ch);

                if (c == 'a' || c == 'e' || c == 'i'
                        || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Digits = " + digits);
        System.out.println("Spaces = " + spaces);
    }
}
