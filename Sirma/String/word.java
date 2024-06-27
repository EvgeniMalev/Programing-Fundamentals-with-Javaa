import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String word = scanner.nextLine();
            
            if (word.equals("end")) {
                break;
            }
            
            String reversedWord = new StringBuilder(word).reverse().toString();
            System.out.println(word + " = " + reversedWord);
        }
        
        scanner.close();
    }
}
