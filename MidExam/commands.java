import java.util.*;

public class Commands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        List<String> array = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equals("End")) break;
            array.add(line);
        }
        
        String text = "";
        
        for (String line : array) {
            String[] parts = line.split(" ");
            String command = parts[0];
            String value = parts.length > 1 ? parts[1] : "";

            switch (command) {
                case "Add":
                    text = add(text, value);
                    break;
                case "Upgrade":
                    text = upgrade(text, value.charAt(0));
                    break;
                case "Print":
                    print(text);
                    break;
                case "Index":
                    index(text, value.charAt(0));
                    break;
                case "Remove":
                    text = remove(text, value);
                    break;
            }
        }
    }

    public static String add(String text, String string) {
        return text + string;
    }

    public static String upgrade(String text, char ch) {
        char newChar = (char) (ch + 1);
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (c == ch) {
                result.append(newChar);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static void index(String text, char ch) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                indices.add(i);
            }
        }
        if (indices.isEmpty()) {
            System.out.println("None");
        } else {
            for (int i = 0; i < indices.size(); i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(indices.get(i));
            }
            System.out.println();
        }
    }

    public static String remove(String text, String string) {
        return text.replace(string, "");
    }
}
