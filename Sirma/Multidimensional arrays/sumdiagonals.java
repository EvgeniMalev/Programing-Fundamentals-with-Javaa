import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); 

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] elements = scanner.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(elements[j]);
            }
        }

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        System.out.print("First diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
            primaryDiagonalSum += matrix[i][i];
        }
        System.out.println();

        System.out.print("Second diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][n - 1 - i] + " ");
            secondaryDiagonalSum += matrix[i][n - 1 - i];
        }
        System.out.println();

        System.out.println("Sum of the first diagonal: " + primaryDiagonalSum);
        System.out.println("Sum of the second diagonal: " + secondaryDiagonalSum);

        scanner.close();
    }
}
