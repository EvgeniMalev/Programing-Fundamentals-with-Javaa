import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.nextLine(); 
        
        char[][] A = new char[M][N];
        char[][] B = new char[M][N];
        
        System.out.println("Enter matrix A:");
        for (int i = 0; i < M; i++) {
            String[] line = scanner.nextLine().trim().split(" ");
            for (int j = 0; j < N; j++) {
                A[i][j] = line[j].charAt(0);
            }
        }
        
        System.out.println("Enter matrix B:");
        for (int i = 0; i < M; i++) {
            String[] line = scanner.nextLine().trim().split(" ");
            for (int j = 0; j < N; j++) {
                B[i][j] = line[j].charAt(0);
            }
        }
        
        char[][] C = new char[M][N];
        
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] == B[i][j]) {
                    C[i][j] = A[i][j];
                } else {
                    C[i][j] = '*';
                }
            }
        }
        
        System.out.println("Matrix C:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
