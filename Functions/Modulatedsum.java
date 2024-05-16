import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraysCount = scanner.nextInt();
        int elementsCount = scanner.nextInt();

        int[] sums = new int[elementsCount];

        int value;
        for (int arrayIndex = 0; arrayIndex < arraysCount; ++arrayIndex) {
            for (int elementIndex = 0; elementIndex < elementsCount; ++elementIndex) {
                value = scanner.nextInt();
                sums[elementIndex] += value;
            }
        }

        int modulo = scanner.nextInt();

        for (int elementIndex = 0; elementIndex < elementsCount; ++elementIndex) {
            System.out.print(sums[elementIndex] % modulo + " ");
        }

        scanner.close();
    }
}
