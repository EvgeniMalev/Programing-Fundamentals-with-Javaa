import java.util.Scanner;

public class CM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();

        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();

        int[][] matrix1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        if (r != r1 || c != c1) {
            System.out.println("not equal");
        } else {

            boolean areEqual = true;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (matrix[i][j] != matrix1[i][j]) {
                        areEqual = false;
                        break;
                    }
                }
                if (!areEqual) {
                    break;
                }
            }
            if (areEqual) {
                System.out.println("equal");
            } else {
                System.out.println("not equal");
            }
        }
        
        scanner.close();
    }
}

