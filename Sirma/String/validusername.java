import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter usernames separated by ', ': ");
        String input = scanner.nextLine();
        
        String[] usernames = input.split(", ");
        
        for (String username : usernames) {
            if (isValidUsername(username)) {
                System.out.println(username);
            }
        }
        
        scanner.close();
    }
    
    public static boolean isValidUsername(String username) {
        if (username.length() < 3 || username.length() > 16) {
            return false;
        }
        
        for (char c : username.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '-' && c != '_') {
                return false;
            }
        }
        
        return true;
    }
}
