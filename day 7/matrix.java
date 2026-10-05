//  Day 7  6th Question  2D array: row and column totals

public class MatrixTotals {
    public static void main(String[] args) {
        int[][] marks = {
            {80, 75, 90},
            {60, 85, 70},
            {95, 65, 88}
        };

        int rows = marks.length;
        int cols = marks[0].length;
        int[] colTotals = new int[cols];

        System.out.println("Marks and student totals:");
        for (int i = 0; i < rows; i++) {
            int rowTotal = 0;
            for (int j = 0; j < cols; j++) {
                System.out.print(marks[i][j] + "\t");
                rowTotal += marks[i][j];
                colTotals[j] += marks[i][j];
            }
            System.out.println("| Total = " + rowTotal);
        }

        System.out.println();
        System.out.println("Subject totals:");
        for (int j = 0; j < cols; j++) {
            System.out.println("Subject " + (j + 1) + " = " + colTotals[j]);
        }
    }
}