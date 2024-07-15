import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(",");
        int rows = Integer.parseInt(dimensions[0].trim());
        int columns = Integer.parseInt(dimensions[1].trim());

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            String[] rowElements = scanner.nextLine().split(",");
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = Integer.parseInt(rowElements[j].trim());
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int startRow = 0;
        int startCol = 0;

        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < columns - 1; j++) {
                int currentSum = matrix[i][j] + matrix[i][j + 1] +
                                 matrix[i + 1][j] + matrix[i + 1][j + 1];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    startRow = i;
                    startCol = j;
                }
            }
        }

        System.out.println("The best 2x2 submatrix is:");
        System.out.println(matrix[startRow][startCol] + " " + matrix[startRow][startCol + 1]);
        System.out.println(matrix[startRow + 1][startCol] + " " + matrix[startRow + 1][startCol + 1]);
        System.out.println("Sum: " + maxSum);
    }
}
