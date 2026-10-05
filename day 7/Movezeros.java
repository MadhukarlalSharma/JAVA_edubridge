//  Day 7  5th Question  Move zeros to the end

import java.util.Arrays;

public class MoveZeros {
    static void moveZeros(int[] a) {
        int pos = 0; 

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                int temp = a[pos];
                a[pos] = a[i];
                a[i] = temp;
                pos++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 12, 0, 7};

        System.out.println("Before: " + Arrays.toString(arr));
        moveZeros(arr);
        System.out.println("After : " + Arrays.toString(arr));
    }
}