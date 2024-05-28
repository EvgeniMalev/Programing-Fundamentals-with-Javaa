/**
Insert and array in java with scanner without declaration on the number of the elements
*/
  
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements separated by commas:");
        String input = scanner.nextLine();
        String[] inputArray = input.split(",");

        int sum = sumEvenNumbers(inputArray);
        System.out.println("Sum of even numbers: " + sum);
    }

    public static int sumEvenNumbers(String[] strArray) {
        int sum = 0;

        for (String str : strArray) {
            try {
                int number = Integer.parseInt(str.trim());
                if (number % 2 == 0) {
                    sum += number;
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid number format: " + str);
            }
        }

        return sum;
    }
}
