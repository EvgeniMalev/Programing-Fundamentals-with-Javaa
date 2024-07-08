import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceWordInFile {
    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        String wordToReplace = "oldWord";  
        String replacementWord = "newWord";  

        try (BufferedReader br = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                String modifiedLine = line.replaceAll("\\b" + wordToReplace + "\\b", replacementWord);
                bw.write(modifiedLine);
                bw.newLine();
            }

        } catch (IOException e) {
            System.err.println("Error processing the file: " + e.getMessage());
        }
    }
}
