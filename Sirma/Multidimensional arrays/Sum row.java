import java.util.Scanner;

public class MatrixDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().trim().split(", ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][cols];
        int totalSum = 0;
        int[] rowSums = new int[rows];

        for (int i = 0; i < rows; i++) {
            String[] elements = scanner.nextLine().trim().split(", ");
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(elements[j]);
                rowSum += matrix[i][j];
                totalSum += matrix[i][j];
            }
            rowSums[i] = rowSum;
        }

        System.out.println("The count of rows: " + rows);
        System.out.println("The count of columns: " + cols);
        System.out.println("The sum of all matrix's elements: " + totalSum);

        for (int i = 0; i < rows; i++) {
            System.out.println("Sum of elements in row " + (i + 1) + ": " + rowSums[i]);
        }

        scanner.close();
    }
}
