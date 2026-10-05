//   Day 7   3rd Question  Linear Search

public class LinearSearch {
    static int search(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 15, 16, 23, 42};
        int[] keys = {23, 7};

        for (int key : keys) {
            int index = search(arr, key);
            if (index != -1) {
                System.out.println(key + " found at index " + index);
            } else {
                System.out.println(key + " not found in the array");
            }
        }
    }
}