public class Q1 {
    public static void main(String[] args) {

        int[] marks = {78, 92, 65, 88, 71, 95, 59};

        int sum = 0;
        int max = marks[0];
        int min = marks[0];

        for (int mark : marks) {
            sum += mark;

            if (mark > max) {
                max = mark;
            }

            if (mark < min) {
                min = mark;
            }
        }

        double average = (double) sum / marks.length;

        System.out.println("Sum = " + sum);
        System.out.printf("Average = %.2f%n", average);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
