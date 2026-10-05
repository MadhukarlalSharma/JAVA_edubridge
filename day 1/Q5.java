import java.util.Arrays;

public class Q5 {

    static void moveZeros(int[] a) {

        int index = 0;

        for (int x : a) {
            if (x != 0) {
                a[index++] = x;
            }
        }

        while (index < a.length) {
            a[index++] = 0;
        }
    }

    public static void main(String[] args) {

        int[] a = {0, 5, 0, 3, 12, 0, 7};

        moveZeros(a);

        System.out.println(Arrays.toString(a));
    }
}
