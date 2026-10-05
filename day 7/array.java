//  Day 7  1st Question   Array Statistics

public class ArrayStats {
    public static void main(String[] args) {
        int[] marks = {78, 92, 65, 88, 71, 95, 59};

        int sum = 0;
        int max = marks[0];
        int min = marks[0];

        for (int m : marks) {
            sum += m;
            if (m > max) {
                max = m;
            }
            if (m < min) {
                min = m;
            }
        }

        double average = (double) sum / marks.length;

        System.out.println("Sum     = " + sum);
        System.out.printf("Average = %.2f%n", average);
        System.out.println("Max     = " + max);
        System.out.println("Min     = " + min);
    }
}