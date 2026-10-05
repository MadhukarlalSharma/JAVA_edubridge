public class Q6 {
    public static void main(String[] args) {

        int[][] marks = {
            {80, 75, 90},
            {60, 85, 70},
            {95, 65, 88}
        };

        System.out.println("Matrix:");

        for (int i = 0; i < marks.length; i++) {

            int rowTotal = 0;

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
                rowTotal += marks[i][j];
            }

            System.out.println(" | Row Total = " + rowTotal);
        }

        System.out.println();

        for (int j = 0; j < 3; j++) {

            int columnTotal = 0;

            for (int i = 0; i < 3; i++) {
                columnTotal += marks[i][j];
            }

            System.out.println("Column " + (j + 1)
                    + " Total = " + columnTotal);
        }
    }
}
