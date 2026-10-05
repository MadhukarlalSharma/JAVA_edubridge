import java.util.Arrays;

public class Q10 {

    static boolean isAnagram(String a, String b) {

        char[] first = a.toLowerCase().toCharArray();
        char[] second = b.toLowerCase().toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("Listen", "Silent"));
        System.out.println(isAnagram("Hello", "World"));
    }
}
