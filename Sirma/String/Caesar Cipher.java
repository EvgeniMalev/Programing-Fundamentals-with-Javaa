import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text to be encrypted: ");
        String inputText = scanner.nextLine();

        String encryptedText = encrypt(inputText);

        System.out.println("Encrypted text: " + encryptedText);
    }

    public static String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (Character.isLetter(currentChar)) {
                char baseChar = Character.isUpperCase(currentChar) ? 'A' : 'a';
                
                char encryptedChar = (char) ((currentChar - baseChar + 3) % 26 + baseChar);
                
                encryptedText.append(encryptedChar);
            } else {
                encryptedText.append(currentChar);
            }
        }

        return encryptedText.toString();
    }
}
