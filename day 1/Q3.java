public class Q3 {

    static int search(int[] a, int key) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] a = {4, 8, 15, 16, 23, 42};

        int key1 = 23;
        int key2 = 7;

        System.out.println("Index of " + key1 + " = " + search(a, key1));
        System.out.println("Index of " + key2 + " = " + search(a, key2));
    }
}
