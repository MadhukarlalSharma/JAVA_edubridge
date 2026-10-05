//  Day 7   4th Question  Second largest element

public class SecondLargest {
    static void findSecondLargest(int[] a) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        boolean found = false;

        for (int x : a) {
            if (x > first) {
                second = first;
                first = x;
            } else if (x > second && x != first) {
                second = x;
                found = true;
            }
        }

        if (found || second != Integer.MIN_VALUE) {
            System.out.println("Second largest = " + second);
        } else {
            System.out.println("No second largest (all elements are equal or array too small)");
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 35, 34};
        findSecondLargest(arr);
    }
}