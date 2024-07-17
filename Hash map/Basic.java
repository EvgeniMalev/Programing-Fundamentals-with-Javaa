import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BasicHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        System.out.println("Enter key-value pairs (type 'exit' to finish):");

        while (true) {
            System.out.print("Enter key: ");
            String key = scanner.nextLine();
            if (key.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter value: ");
            String value = scanner.nextLine();
            if (value.equalsIgnoreCase("exit")) {
                break;
            }

            map.put(key, value);
        }

        scanner.close();

        System.out.println("The map contains the following key-value pairs:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
