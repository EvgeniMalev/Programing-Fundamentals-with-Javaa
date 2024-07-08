import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordLengthReader {
    public static void main(String[] args) {
        String fileName = "input.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    System.out.println("Word: \"" + word + "\", Length: " + word.length());
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
