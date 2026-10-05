public class Q4 {

    static int secondLargest(int[] a) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : a) {

            if (x > first) {
                second = first;
                first = x;
            } else if (x > second && x != first) {
                second = x;
            }
        }

        return second;
    }

    public static void main(String[] args) {

        int[] a = {12, 35, 1, 10, 35, 34};

        System.out.println("Second largest = " + secondLargest(a));
    }
}
