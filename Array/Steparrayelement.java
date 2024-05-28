import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArray = input.split(",");

        int step = scanner.nextInt();

        String result = collectElementsByStep(inputArray, step);
        System.out.println("Collected elements: " + result);
    }

    public static String collectElementsByStep(String[] array, int step) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < array.length; i += step) {
            result.append(array[i].trim()).append(" ");
        }

        return result.toString().trim();
    }
}
