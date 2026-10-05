//   Day 7  2nd Question   Reverse Array   Reverse an array in place without creating a second array

import java.util.Arrays;

public class ReverseArray {
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
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Before: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("After : " + Arrays.toString(arr));
    }
}