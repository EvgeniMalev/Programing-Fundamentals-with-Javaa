import java.util.Arrays;
import java.util.Scanner;

public class Numbering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] products = input.split(" ");

        printOrderedProducts(products);
    }

    public static void printOrderedProducts(String[] products) {
        Arrays.sort(products);
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }
    }
}
