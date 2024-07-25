import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phonebook = new HashMap<>();

        System.out.println("Enter contacts (name and phone number). Type 'search' to perform a search.");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("search")) {
                break;
            }

            String[] parts = input.split("\\s+");
            if (parts.length != 2) {
                System.out.println("Invalid input. Please enter a name and a phone number.");
                continue;
            }

            String name = parts[0];
            String number = parts[1];

            phonebook.put(name, number);
        }

        System.out.println("Enter names to search for. Type 'exit' to end the search.");

        while (true) {
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            if (phonebook.containsKey(name)) {
                System.out.println(name + " -> " + phonebook.get(name));
            } else {
                System.out.println("Contact " + name + " not found.");
            }
        }

        scanner.close();
    }
}
