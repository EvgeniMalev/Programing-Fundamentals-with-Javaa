import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String fileName = "input.txt";
        Map<Character, Integer> charFrequency = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            int c;
            while ((c = br.read()) != -1) {
                char character = (char) c;
                if (Character.isWhitespace(character)) {
                    continue; 
                }
                charFrequency.put(character, charFrequency.getOrDefault(character, 0) + 1);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            System.out.println("Character: '" + entry.getKey() + "', Frequency: " + entry.getValue());
        }
    }
}
