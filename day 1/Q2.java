import java.util.Arrays;

public class Q2 {

    static void reverse(int[] a) {
        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50, 20, 30, 10};

        reverse(a);

        System.out.println(Arrays.toString(a));
    }
}
