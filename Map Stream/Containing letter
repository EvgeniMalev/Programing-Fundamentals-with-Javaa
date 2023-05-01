import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");

// filter the word if the word contains "o" or "e"

        Arrays.stream(input)
                .filter(word -> word.contains("o") || word.contains("e"))
                .forEach(System.out::println);
    }
}
